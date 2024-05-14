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
		return null;
	}

}
