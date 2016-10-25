package com.workoutapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.workoutapp.domain.Workout;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {

}
