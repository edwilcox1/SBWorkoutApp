package com.workoutapp.domain;

import java.util.Date;


import javax.persistence.*;

@Entity
public abstract class Workout {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id;
	protected String name;
	protected Date date;
	protected String notes;
	
	
	public Workout(String name, Date date, String notes){
		this.name = name;
		this.date = date;
		this.notes = notes;
	}
	
	public Workout(Date date, String notes){
		
		this.date = date;
		this.notes = notes;
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
		return this.id;
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
	
	public Date getDate(){
		return this.date;
	}
	
	public void setNotes(String notes){
		this.notes = notes;
	}
	
	
	public String getNotes(){
		return this.notes;
	}
	
	
	@Override
	public String toString(){
		return String.format("%s: %s", this.name, this.notes);
	}
	
	
	
}
