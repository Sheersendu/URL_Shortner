package com.shortifyMe.shortifyMe.controllers;

import com.shortifyMe.shortifyMe.model.User;
import com.shortifyMe.shortifyMe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @Autowired
    public void UserController (UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public User createUser() {

        // Find all users
//        List<User> allUsers = userService.findAllUsers();


        // Insert or update user
        User newUser = new User();
        newUser.setUserId(1);
        newUser.setName("Sheersendu");
        newUser.setEmail("sheersendu@example.com");
        User savedUser = userService.saveOrUpdateUser(newUser);

        // Find user by ID
        Optional<User> userById = userService.findUserById("1");
        System.out.println(userById);
        // Delete user by ID
//        userService.deleteUserById(savedUser.getId());
        return newUser;
    }
}
