package com.workoutapp.controllers;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.workoutapp.domain.Cardio;
import com.workoutapp.domain.Climb;
import com.workoutapp.domain.Climbing;
import com.workoutapp.domain.Workout;

@Controller
public class WorkoutController {
	
	private List<Workout> workouts;

	public WorkoutController(){
		
		workouts = new ArrayList<>();
		List<Climb> climbs1 = new ArrayList<>();
		climbs1.add(new Climb(510));
		climbs1.add(new Climb(511));
		climbs1.add(new Climb(511));
		climbs1.add(new Climb(511));
		climbs1.add(new Climb(511));

		Workout w1 = new Climbing("First ever climb", new Date(), "Only got a few climbs in", 5, 80, "Mission Cliffs", false, climbs1);
		Workout w2 = new Cardio("Bike ride", new Date(), "More mellow bike ride", 30, "Diablo Rock Gym", 300, 5);
		
		workouts.add(w1);
		workouts.add(w2);
	}
	
	@RequestMapping(value = "/workouts", method = RequestMethod.GET)
	public String listWorkouts(Model model){
		
		model.addAttribute("workouts", workouts);
		return "workouts";
	}
	
	@RequestMapping(value="/log/climb", method = RequestMethod.GET)
	public String workoutForm(Model model){
		model.addAttribute("Workout", new Climbing());
		return "log/climb";
		
	}
	
	@RequestMapping(value="/log/climb", method = RequestMethod.POST)
	public String workoutSubmit(@ModelAttribute Workout workout){
		return "result";
	}

	private String getWorkoutStrings(){
		
		StringBuilder buf = new StringBuilder();
		for (Workout workout: workouts){
			buf.append(workout.toString() + "\n");
		}
		return buf.toString();
	}
	
}
