package com.yash.bookMyShow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	
	private int customerId;
	
	private int seatCount;
	
	private String seatNumbers;
	
	private int seatAvailable;
	
	private int ticketStatus;
	
	private double ticketPrice;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
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

	public String getSeatNumbers() {
		return seatNumbers;
	}

	public void setSeatNumbers(String seatNumbers) {
		this.seatNumbers = seatNumbers;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public int getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(int ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, int customerId, int seatCount, String seatNumbers, int seatAvailable, int ticketStatus,
			double ticketPrice) {
		super();
		this.ticketId = ticketId;
		this.customerId = customerId;
		this.seatCount = seatCount;
		this.seatNumbers = seatNumbers;
		this.seatAvailable = seatAvailable;
		this.ticketStatus = ticketStatus;
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", customerId=" + customerId + ", seatCount=" + seatCount + ", seatNumbers=" + seatNumbers
				+ ", seatAvailable=" + seatAvailable + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice
				+ "]";
	}
	
}