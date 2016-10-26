package com.workoutapp.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="CARDIO")
@DiscriminatorValue("Cardio")
public class Cardio extends Workout {
	
	private String name;
	private Date date;
	private String notes;
	private String location;
	private float duration;
	private int calories;
	private float distance;
	
	
	public Cardio(String name, Date date, String notes, float duration, String location, int calorie, float distance){
		super(name, date, notes, location, duration);
		
		this.calories = calories;
		this.distance = distance;
	}
	
	public Cardio(float duration, int calories, float distance){
		super();
		this.duration = duration;
		this.calories = calories;
		this.distance = distance;
	}
	
	public void setDuration(float duration){
		this.duration = duration;
	}
	
	public float getDuration(){
		return this.duration;
	}
	
	public void setCalories(int calories){
		this.calories = calories;
	}
	
	public int getCalories(){
		return this.calories;
	}
	
	public void setDistance(float distance){
		this.distance = distance;
	}
	
	public float getDistance(){
		return this.distance;
	}
	
	
	
	
}
