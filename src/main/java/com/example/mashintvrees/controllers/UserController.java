package com.example.mashintvrees.controllers;

import com.example.mashintvrees.Service.UserService;
import com.example.mashintvrees.model.User;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/users")
    public List<User> createUsers(@RequestBody List<User> users) {
        return userService.createUsers(users);
    }

    // READ
    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    // UPDATE
    @PutMapping("/user/{id}")
    public User updateUser(@RequestBody long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @PutMapping("/users")
    public List<User> updateUsers(@RequestBody List<User> users) {
        return userService.updateUsers(users);
    }

    // DELETE
    @DeleteMapping("/user")
    public String deleteUser(long id) {
        return userService.deleteUser(id);
    }

    @DeleteMapping("/users")
    public List<User> deleteUsers(@RequestBody List<User> users) {
        return userService.deleteUsers(users);
    }
}
