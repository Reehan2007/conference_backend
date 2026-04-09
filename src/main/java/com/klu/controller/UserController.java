package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klu.model.User;
import com.klu.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService service;

    // ✅ REGISTER
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            User savedUser = service.register(user);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Registration failed");
        }
    }

    // ✅ LOGIN (FINAL FIXED)
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        try {
            User existingUser = service.login(user.getEmail(), user.getPassword());
            return ResponseEntity.ok(existingUser); // ✅ success
        } catch (RuntimeException e) {
            return ResponseEntity.status(401).body(e.getMessage()); // ✅ proper error
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Server error");
        }
    }

    // ✅ GET ALL USERS
    @GetMapping
    public ResponseEntity<?> getAll() {
        List<User> users = service.getAllUsers();
        return ResponseEntity.ok(users);
    }
}