package com.yash.bookMyShow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	
	private String movieName;
	
	private String movieHours;
	
	private String language;
	
	private String description;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieHours() {
		return movieHours;
	}

	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Movies(int movieId, String movieName, String movieHours, String language, String description) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieHours = movieHours;
		this.language = language;
		this.description = description;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieHours=" + movieHours + ", language="
				+ language + ", description=" + description + "]";
	}

}
