package com.smartinterview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.smartinterview.entity.User;
import com.smartinterview.repository.UserRepository;
import com.smartinterview.util.JwtUtil;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User existingUser = userRepository.findAll()
                .stream()
                .filter(u -> u.getEmail().equals(user.getEmail()) &&
                             u.getPassword().equals(user.getPassword()))
                .findFirst()
                .orElse(null);

        if (existingUser != null) {
            return JwtUtil.generateToken(user.getEmail());
        } else {
            return "Invalid Credentials";
        }
    }
}