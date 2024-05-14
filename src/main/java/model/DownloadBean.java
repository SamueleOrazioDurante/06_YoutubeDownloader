package model;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import config.APIConfig;

public class DownloadBean implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	public DownloadBean() {
		super();
	}
	
	public String getLink(String id, String format)
	{
		String link = null;
		switch(format) {
			case "MP3":{
				link = this.downloadMP3(id);
				break;
			}
			case "MP4":{
				link = this.downloadMP4(id);
				break;
			}
			default:{
				return "Errore";
			}
		}
		
		return link;
	}
	
	private String downloadMP3(String id) {
		
		//build the URL of the API based from info from APIConfig CLASS (APIKey + BaseURL) and type of request (downloadMP3 + id attribute + link for coming back to the website)
		String url = APIConfig.getBaseURL();
		url += "/download/MP3";
		url = APIConfig.addAPIKey(url);
		url += "&id="+id;
		url += "&link="+APIConfig.getBaseApplicationURL();
		
		//build the request using URL and method
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
			
		//send request to the API and save responde in a variable
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jsonString = response.body();
		JSONObject json = new JSONObject(jsonString);
		
		return json.getString("link");
	}	
		
		
	public String downloadMP4(String id) {
		
		//build the URL of the API based from info from APIConfig CLASS (APIKey + BaseURL) and type of request (downloadMP4 + id attribute)
		String url = APIConfig.getBaseURL();
		url += "/download/MP4";
		url = APIConfig.addAPIKey(url);
		url += "&id="+id;
		
		//build the request using URL and method
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
			
		//send request to the API and save responde in a variable
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.MP4Link(this.fromJSONtoQualitiesList(response.body()),id);
	}

	public QualitiesList fromJSONtoQualitiesList(String jsonString) {
		QualitiesList qualitiesList = null;
		
		JSONObject json = new JSONObject(jsonString);
		JSONArray formats = json.getJSONArray("formats");
		
		ArrayList<MP4Video> mp4Videos = new ArrayList<MP4Video>();
		
		for(int i=0;i<formats.length();i++) {
			
			JSONObject format = formats.getJSONObject(i);
			String url = format.getString("url");
			String quality = format.getString("qualityLabel");
			
			MP4Video mp4video = new MP4Video(url,quality);
			
			mp4Videos.add(mp4video);
		}
		
		qualitiesList = new QualitiesList(mp4Videos);
		
		return qualitiesList;
	}
	
	public String MP4Link(QualitiesList qualitiesList, String id) {
		
		//generate web link with the base application url + jsp page + an attribute for videoes id + an attribute for every quality of the video (link to download + quality value)
		String link = APIConfig.getBaseApplicationURL();
		link += "/WebContent/selectMP4Quality.jsp";
		link += "?id="+id;
		
		ArrayList<MP4Video> mp4Videos = qualitiesList.getMp4videos();
		
		for(int i = 0; i<mp4Videos.size();i++) {
			MP4Video mp4video = mp4Videos.get(i);
			link +="&quality"+i+"="+mp4video.getQuality();
			link +="&url"+i+"="+mp4video.getUrl();
		}
		
		return link;
	}
}
