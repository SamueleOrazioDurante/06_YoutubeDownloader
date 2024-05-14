package model;

public class MP4Video {
	
	private String url;
	private String quality;
	
	public MP4Video(String url, String quality) {
		super();
		this.url = url;
		this.quality = quality;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	
}