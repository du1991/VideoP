package org.rf.model;

public class Movie {
	private int id;
	private String name;
	private String publisher;
	private String publishtime;
	private String movietype;
	
	public Movie(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}
	public String getMovietype() {
		return movietype;
	}
	public void setMovietype(String movietype) {
		this.movietype = movietype;
	}
	public Movie(int id, String name, String publisher, String publishtime, String movietype) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.publishtime = publishtime;
		this.movietype = movietype;
	}
	
}
