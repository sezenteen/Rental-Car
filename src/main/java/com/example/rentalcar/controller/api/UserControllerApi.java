package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.User;
import com.example.rentalcar.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserControllerApi {
    UserService userService;

    public UserControllerApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/api/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/api/users")
    public List<User> createUsers(@RequestBody List<User> users) {
        return userService.createUsers(users);
    }

    @PutMapping("/api/user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @PutMapping("/api/users")
    public List<User> updateUsers(@RequestBody List<User> users) {
        return userService.updateUsers(users);
    }

    @DeleteMapping("/api/user/{id}")
    public String deleteUser(@PathVariable Long id) {
        return userService.deleteUserById(id);
    }

    @DeleteMapping("/api/users")
    public List<User> deleteUsers(@RequestBody List<User> users) {
        return userService.deleteUsers(users);
    }
}

