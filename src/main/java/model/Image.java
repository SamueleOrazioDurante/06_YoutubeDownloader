package model;

public class Image{
	
	private String url;
	private int width;
	private int lenght;
	
	public Image(String url, int width, int lenght) {
		super();
		this.url = url;
		this.width = width;
		this.lenght = lenght;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	
	
}