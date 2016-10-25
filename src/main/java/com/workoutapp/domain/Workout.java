package com.workoutapp.domain;

import java.util.Date;


public abstract class Workout {

	//TODO: Configure date formatting with Spring
	
	protected static double id;
	protected double woId;
	protected String name;
	protected Date date;
	protected String notes;
	
	
	public Workout(String name, Date date, String notes){
		this.name = name;
		this.date = date;
		this.notes = notes;
		this.woId = ++id;
	}
	
	public Workout(Date date, String notes){
		
		this.date = date;
		this.notes = notes;
		this.woId = ++id;
	}
	
	public Workout(String name, Date date){
		this.name = name;
		this.date = date;
		
	}
	
	public Workout(){
		this.name = "none";
		this.date = new Date();
		this.notes = "none";
	}
	
	public double getId(){
		return this.woId;
	}
	
	
	public void setName(String type){
		this.name = name;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public void setNotes(String notes){
		this.notes = notes;
	}
	
	
	public String getNotes(){
		return this.notes;
	}
	
	
	
	
	
	
}
