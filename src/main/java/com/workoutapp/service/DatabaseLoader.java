package com.workoutapp.service;

import com.workoutapp.domain.Climbing;
import com.workoutapp.repositories.ClimbingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by ethan on 8/24/17.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ClimbingRepository repository;

    @Autowired
    public DatabaseLoader(ClimbingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Climbing("test", "total test"));
    }
}
