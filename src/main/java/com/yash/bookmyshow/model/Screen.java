
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
