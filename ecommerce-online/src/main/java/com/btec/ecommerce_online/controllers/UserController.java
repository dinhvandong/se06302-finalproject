package com.btec.ecommerce_online.controllers;

import com.btec.ecommerce_online.entities.User;
import com.btec.ecommerce_online.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        // Save user to MongoDB
       User result =  userService.createUser(user);
        return result;
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        // Save user to MongoDB
        return userService.findAll();
    }


}
