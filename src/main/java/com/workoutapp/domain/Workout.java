package com.workoutapp.domain;

import java.util.Calendar;
import java.util.Date;


import javax.persistence.*;

@Entity
@Table(name="WORKOUT")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class Workout {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="WORKOUT_ID")
	private long workoutId;

//	@ManyToOne
//	@JoinColumn(name="USER_ID")
//	private User user;
	
	@Column(name="WORKOUT_NAME")
	private String name;
	
	@Column(name="WORKOUT_DATE")
	private Date date;
	
	@Column(name="DURATION")
	private float duration;
	
	@Column(name="NOTES")
	private String notes;
	
	@Column(name="LOCATION")
	private String location;
	
	
	public Workout(String name, Date date, String notes, String location, float duration){
		this.name = name;
		this.date = date;
		this.notes = notes;
		this.location = location;
		this.duration = duration;
	}
	
	public Workout(Date date, String notes, String location, float duration){
		this("None", date, notes, location, duration);
	}

	public Workout(String name, String notes) {
		this(name, new Date(), notes, "N/A", 0.0f);
	}
	public Workout(String name, Date date, String location, float duration){
		this(name, date, "none", location, duration);
		
	}
	
	public Workout(){
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 0);
		
		this.name = "none";
		this.date = today.getTime();
		this.notes = "none";
		this.duration = 0.0f;
		
	}
	
	public double getWorkoutId(){
		return this.workoutId;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public void setDuration(float duration){
		this.duration = duration;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public void setNotes(String notes){
		this.notes = notes;
	}
	
	public Date getDate(){
		return this.date;
	}
	

	public String getLocation(){
		return location;
	}
	
	public String getNotes(){
		return this.notes;
	}
	
	public float getDuration(){
		return this.duration;
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s", this.name, this.notes);
	}
	
	
	
}
