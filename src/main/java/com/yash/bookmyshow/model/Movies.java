package com.yash.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Movies {

	
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
