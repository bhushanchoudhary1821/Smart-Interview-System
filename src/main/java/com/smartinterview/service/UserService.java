package com.smartinterview.service;

import java.util.List;

import com.smartinterview.entity.User;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
}