package model;

public class Video{
	
	private String id;
	private String title;
	private String author;
	private String description;
	private int views;
	private String video_lenght;
	private Image thumbnail;
	
	public Video(String id, String title, String author, String description, int views, String video_lenght,
			Image thumbnail) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.views = views;
		this.video_lenght = video_lenght;
		this.thumbnail = thumbnail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getVideo_lenght() {
		return video_lenght;
	}

	public void setVideo_lenght(String video_lenght) {
		this.video_lenght = video_lenght;
	}

	public Image getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Image thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	
	
}