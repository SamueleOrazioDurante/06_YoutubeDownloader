package model;

import java.util.ArrayList;

//wrapper class for usage in request parameter
public class VideoesList{
	
	private ArrayList<Video> videoes;
	
	public VideoesList(ArrayList<Video> videoes) {
		this.videoes = videoes;
	}

	public ArrayList<Video> getVideoes() {
		return videoes;
	}

	public void setVideoes(ArrayList<Video> videoes) {
		this.videoes = videoes;
	}
	
}