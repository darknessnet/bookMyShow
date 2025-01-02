package com.yash.bookMyShow.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	
	private int customerId;

	private int seatCount;
	
	private String movieName;
	
	private String seatNumbers;
	
	private double amount;
	
	private String status;
	
	private LocalDateTime date;
	
    private LocalDateTime update_at;

	public int getId() {
		return ticketId;
	}

	public void setId(int id) {
		this.ticketId = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(String seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public LocalDateTime getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(LocalDateTime update_at) {
		this.update_at = update_at;
	}

	public Ticket2(int ticketId, int customerId, int seatCount, String movieName, String seatNumbers, double amount, String status,
			LocalDateTime date, LocalDateTime update_at) {
		super();
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.seatCount = seatCount;
		this.movieName = movieName;
		this.seatNumbers = seatNumbers;
		this.amount = amount;
		this.status = status;
		this.date = date;
		this.update_at = update_at;
	}

	public Ticket2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
