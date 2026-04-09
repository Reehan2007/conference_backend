package com.klu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.User;
import com.klu.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // ✅ REGISTER USER
    public User register(User user) {
        return repo.save(user);
    }

    // ✅ LOGIN USER (FINAL SAFE VERSION)
    public User login(String email, String password) {

        // 🔍 find user by email
        User user = repo.findByEmail(email);

        // ❌ user not found
        if (user == null) {
            throw new RuntimeException("User not found");
        }

        // ❌ password null check
        if (user.getPassword() == null) {
            throw new RuntimeException("Password is null in database");
        }

        // ❌ wrong password
        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        // ✅ success
        return user;
    }

    // ✅ GET ALL USERS
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}