package com.yash.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="theatre")
public class Theatre {
	
	public Theatre() {
		
	}

	public Theatre(int theatreid, String name, String location) {
		super();
		this.theatreid = theatreid;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", name=" + name + ", location=" + location + "]";
	}

	public int getTheatreid() {
		return theatreid;
	}

	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theatreid;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String location;
	
}
