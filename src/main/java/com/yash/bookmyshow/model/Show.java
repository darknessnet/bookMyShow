package com.yash.bookmyshow.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Show {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int showId;
	
	@Column(nullable = false)
	private LocalDateTime showStartTime;
	
	@Column(nullable = false)
	private LocalDateTime showEndTime;
	
	
	@ManyToOne
	@JoinColumn(name="screenId")
	private Screen screen;
	
	
	
	@OneToMany
	@JoinColumn(name="theatreId", nullable = false)
	private Theatre theatre;
	
	@OneToMany
	@JoinColumn(name="movieId", nullable = false)
	private Movies movies;
	

}
