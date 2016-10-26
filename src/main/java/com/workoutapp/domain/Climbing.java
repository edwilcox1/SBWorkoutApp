package com.workoutapp.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name="CLIMBING")
@DiscriminatorValue("Climbing")
public class Climbing extends Workout{
	
	@Column(name="NUM_CLIMBS")
	private int numClimbs;
	
	@Column(name="OUTDOOR")
	private boolean outdoor;
	
	@OneToMany(mappedBy="climbId")
	@Where(clause="DTYPE='CLIMBING'")
	private List<Climb> climbs;
	
	public Climbing(String name, Date date, String notes, int numClimbs, float duration, 
			String location, boolean outdoor, List<Climb> climbs){
		
		super(name, date, notes, location, duration);
		this.numClimbs = numClimbs;
		this.outdoor = outdoor;
		this.climbs = climbs;
		
	}
	
	public void setNumClimbs(int numClimbs){
		this.numClimbs = numClimbs;
	}
	
	public int getNumClimbs(){
		return this.numClimbs;
	}
	
	public void setDuration(float duration){
		super.setDuration(duration);
	}
	
	public float getDuration(){
		return super.getDuration();
	}
	
	public void setLocation(String location){
		super.setLocation(location);
	}
	
	public String getLocation(){
		return super.getLocation();
	}
	
	public void setOutdoor(boolean outdoor){
		this.outdoor = outdoor;
	}
	
	public boolean getOutdoor(){
		return this.outdoor;
	}
	
	public void setClimbs(List<Climb> climbs){
		this.climbs = climbs;
	}
	
	public List<Climb> getClimbs(){
		return this.climbs;
	}
}
