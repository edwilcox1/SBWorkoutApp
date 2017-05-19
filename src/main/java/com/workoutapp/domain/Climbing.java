package com.workoutapp.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Where;

@Entity
@Table(name="CLIMBING")
@DiscriminatorValue("Climbing")
public class Climbing extends Workout{
	
	@Column(name="NUM_CLIMBS")
	private int numClimbs;
	
	@Column(name="OUTDOOR")
	private boolean outdoor;
	
	@OneToMany
	@Where(clause="DTYPE='CLIMBING'")
	private List<Climb> climbs;
	
	public Climbing(){}

	public Climbing(String name, String notes) {
		super(name, notes);
	}
	
	public Climbing(String name, Date date, String notes, int numClimbs, float duration, 
			String location, boolean outdoor, List<Climb> climbs){
		
		super(name, date, notes, location, duration);
		this.numClimbs = numClimbs;
		this.outdoor = outdoor;
		this.climbs = climbs;
		
	}
	
	public void setName(String name){
		super.setName(name);
	}
	
	public void setNotes(String notes){
		super.setNotes(notes);
	}
	
	public void setDate(Date date){
		super.setDate(date);
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

	public String getClimbStrings() {
		StringBuilder buf = new StringBuilder();
		for (Climb climb : climbs) {
			buf.append(climb.toString()+"\n");
			buf.append(climb.getGrade()+"\n");
		}
		return buf.toString();
	}

	@Override
	public String toString() {
		return this.getName()+"\n"+this.getLocation()+"\n"+this.getNotes()+ this.getClimbStrings();
	}
}
