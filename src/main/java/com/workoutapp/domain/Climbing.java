package com.workoutapp.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Climbing extends Workout{
	
	private String name;
	private Date date;
	private String notes;
	private int numClimbs;
	private float duration;
	private String location;
	private boolean outdoor;
	
	private List<Climb> climbs;
	
	public Climbing(String name, Date date, String notes, int numClimbs, float duration, 
			String location, boolean outdoor, List<Climb> climbs){
		
		super(name, date, notes);
		this.numClimbs = numClimbs;
		this.duration = duration;
		this.location = location;
		this.outdoor = outdoor;
		this.climbs = climbs;
		
	}
	
	public Climbing(int numClimbs, String location, 
			boolean outdoor, List<Climb> climbs){
		
		super();
		this.numClimbs = numClimbs;
		this.location = location;
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
		this.duration = duration;
	}
	
	public float getDuration(){
		return this.duration;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getLocation(){
		return this.location;
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
