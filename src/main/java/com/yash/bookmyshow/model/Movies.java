package com.yash.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movies {

	
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", moviesHours=" + moviesHours
				+ ", language=" + language + ", description=" + description + "]";
	}

	public Movies(int movieId, String movieName, String moviesHours, String language, String description) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.moviesHours = moviesHours;
		this.language = language;
		this.description = description;
	}

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

	public String getMoviesHours() {
		return moviesHours;
	}

	public void setMoviesHours(String moviesHours) {
		this.moviesHours = moviesHours;
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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	
	@Column(nullable = false)
	private String movieName;
	
	@Column(nullable = false)
	private String moviesHours;
	
	@Column(nullable = false)
	private String language;
	
	@Column(nullable = false)
	private String description;
	
	
	
}
