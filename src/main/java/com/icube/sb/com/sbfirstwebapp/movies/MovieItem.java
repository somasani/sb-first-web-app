package com.icube.sb.com.sbfirstwebapp.movies;

public class MovieItem {
	private String language;
	private String title;
	private String genre;
	private String director;
	private String actor;
	
	public MovieItem() {
			}
	
	public String getLanguage() {
		return language;
	}

	public MovieItem(String language, String title, String genre, String director, String actor) {
		super();
		this.language = language;
		this.title = title;
		this.genre = genre;
		this.director = director;
		this.actor = actor;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	
	
}
