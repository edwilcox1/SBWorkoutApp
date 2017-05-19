package com.workoutapp.service;

import com.workoutapp.domain.User;

/**
 * Created by ethan on 5/18/17.
 */
public interface UserService {
    public User findUserByEmail(String email);
    public User findUserById(long id);
    public void saveUser(User user);
}
