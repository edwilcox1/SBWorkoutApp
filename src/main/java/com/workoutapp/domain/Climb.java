package com.workoutapp.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "CLIMB")
public class Climb implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private int grade;
	private String location;
	
//	@ManyToOne
//	@JoinColumn(name="idWorkout")
	
	public Climb(String name, int grade, String location){
		this.name = name;
		this.grade = grade;
		this.location = location;
	}
	
	public Climb(int grade, String location){
		this("none", grade, location);
	}
	
	public Climb(int grade){
		this(grade, "unknown");
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
