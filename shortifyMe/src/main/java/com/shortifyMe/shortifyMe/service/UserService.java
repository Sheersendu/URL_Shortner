package com.shortifyMe.shortifyMe.service;
import com.shortifyMe.shortifyMe.model.User;
import com.shortifyMe.shortifyMe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Find all users
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    // Find user by ID
    public Optional<User> findUserById(String id) {
        return userRepository.findById(id);
    }

    // Insert or update user
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    // Delete user by ID
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }
}

