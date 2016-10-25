package com.workoutapp.domain;

import javax.persistence.*;


public class Climb {
	
	private String name;
	private int grade;
	private String location;
	
	
	public Climb(String name, int grade, String location){
		this.name = name;
		this.grade = grade;
		this.location = location;
	}
	
	public Climb(int grade, String location){
		this.name = "none";
		this.grade = grade;
		this.location = location;
	}
	
	public Climb(int grade){
		this.name = "none";
		this.grade = grade;
		this.location = "unkown";
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setGrade(int grade){
		this.grade = grade;
	}
	
	public int getGrade(){
		return this.grade;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getLocation(){
		return this.location;
	}
}
