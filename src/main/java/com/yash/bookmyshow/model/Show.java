package com.yash.bookmyshow.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="show")
public class Show {

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", screen=" + screen + ", theatre=" + theatre + ", movies=" + movies + "]";
	}

	public Show(int showId, LocalDateTime showStartTime, LocalDateTime showEndTime, Screen screen, Theatre theatre,
			Movies movies) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.screen = screen;
		this.theatre = theatre;
		this.movies = movies;
	}

	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

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
