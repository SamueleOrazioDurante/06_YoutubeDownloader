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

public class SearchBean implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	public SearchBean() {
		super();
	}
	
	public VideoesList search(String query)
	{
		//build the URL of the API based from info from APIConfig CLASS (APIKey + BaseURL) and type of request (search + query attribute)
		String url = APIConfig.getBaseURL();
		url += "/search";
		url = APIConfig.addAPIKey(url);
		url += "&query="+query;
		
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

		//from response JSON to Video Arraylist in a wrapper class VideoesList -> easier to manage in a JSP enviroment
		VideoesList videoesList = new VideoesList(this.fromJSONToArrayListOfVideoes(response.body()));
		return videoesList;
	
	}

	private ArrayList<Video> fromJSONToArrayListOfVideoes(String jsonString){
		
		ArrayList<Video> videoes = new ArrayList<Video>();
		
		JSONObject json = new JSONObject(jsonString);
		JSONArray jsonVideoes = json.getJSONArray("videos");
		
		//for every Video object inside the JSON I take every attribute and create a new Video Object and put it in the arraylist
		
		for(int i = 0; i < jsonVideoes.length(); i++) {
			
			JSONObject jsonVideo = jsonVideoes.getJSONObject(i);
			
			String id = jsonVideo.getString("video_id");
			String title = jsonVideo.getString("title");
			String author = jsonVideo.getString("author");
			String description = jsonVideo.getString("description");
			int views = jsonVideo.getInt("number_of_views");
			String video_lenght = jsonVideo.getString("video_length");
			
			JSONArray jsonImages = jsonVideo.getJSONArray("thumbnails");
			JSONObject jsonImage = jsonImages.getJSONObject(0);
			String url = jsonImage.getString("url");
			int width = jsonImage.getInt("width");
			int height = jsonImage.getInt("height");
			
			Image image = new Image(url,width,height);
			Video video = new Video(id,title,author,description,views,video_lenght,image);
			
			videoes.add(video);

		}
		
		return videoes;
	}
}
