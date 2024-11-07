
package com.yash.bookmyshow.model;

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
@Table(name="screens")
public class Screen {
	
	
	

	@Override
	public String toString() {
		return "Screen [screenid=" + screenid + ", screenName=" + screenName + ", row=" + row + ", column=" + column
				+ ", show=" + show + ", theatre=" + theatre + "]";
	}

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Screen(int screenid, String screenName, int row, int column, Show show, Theatre theatre) {
		super();
		this.screenid = screenid;
		this.screenName = screenName;
		this.row = row;
		this.column = column;
		this.show = show;
		this.theatre = theatre;
	}

	public int getScreenid() {
		return screenid;
	}

	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int screenid;
	
	@Column(nullable = false)
	private String screenName;
	
	@Column(nullable = false)
	private int row;
	
	@Column(nullable = false)
	private int column;
	
	
	
	@OneToMany
	@JoinColumn(name="showId", nullable =false)
	private Show show;
	
	@ManyToOne
	@JoinColumn(name="theatreId", nullable = false)
	private Theatre theatre;

	
}
