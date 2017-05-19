package com.workoutapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.workoutapp.domain.Workout;
import org.springframework.stereotype.Repository;

@Repository("workoutRepository")
public interface WorkoutRepository extends CrudRepository<Workout, Long> {
    Workout findById(long workoutId);

}
