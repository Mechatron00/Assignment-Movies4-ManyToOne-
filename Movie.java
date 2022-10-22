package com.ProjectAssignment.Movies4;

import javax.persistence.Access;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
public class Movie 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int srno;
	
	String movie1;
	String movie2;
	String movie3;
	String movie4;
	
	
	@ManyToOne(targetEntity=Year.class,cascade=CascadeType.ALL)
	private Year year;
	
	public String getMovie1() {
		return movie1;
	}
	public void setMovie1(String movie1) {
		this.movie1 = movie1;
	}
	public String getMovie2() {
		return movie2;
	}
	public void setMovie2(String movie2) {
		this.movie2 = movie2;
	}
	public String getMovie3() {
		return movie3;
	}
	public void setMovie3(String movie3) {
		this.movie3 = movie3;
	}
	public String getMovie4() {
		return movie4;
	}
	public void setMovie4(String movie4) {
		this.movie4 = movie4;
	}
	
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [srno=" + srno + ", movie1=" + movie1 + ", movie2=" + movie2 + ", movie3=" + movie3 + ", movie4="
				+ movie4 + ", year=" + year + "]";
	}
	
	
}
