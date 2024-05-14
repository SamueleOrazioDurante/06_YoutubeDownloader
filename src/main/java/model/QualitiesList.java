package model;

import java.util.ArrayList;

public class QualitiesList{
	
	private ArrayList<MP4Video> mp4videos;

	public QualitiesList(ArrayList<MP4Video> mp4videos) {
		super();
		this.mp4videos = mp4videos;
	}

	public ArrayList<MP4Video> getMp4videos() {
		return mp4videos;
	}

	public void setMp4videos(ArrayList<MP4Video> mp4videos) {
		this.mp4videos = mp4videos;
	}
	
	
}