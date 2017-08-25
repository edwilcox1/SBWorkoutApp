package com.workoutapp.repositories;

import com.workoutapp.domain.Climbing;
import org.springframework.data.repository.CrudRepository;

import com.workoutapp.domain.Workout;
import org.springframework.stereotype.Repository;

@Repository("climbingRepository")
public interface ClimbingRepository extends CrudRepository<Climbing, Long> {
    Climbing findByWorkoutId(long workoutId);

}
