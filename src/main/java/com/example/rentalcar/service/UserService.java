package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.User;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    // Get
    List<User> getAllUsers();

    public Optional<User> getUserById(Long id);

    // Create
    List<User> createUsers(List<User> users);

    public User createUser(User user);

    // Update
    public User updateUser(User user);

    List<User> updateUsers(List<User> users);

    // Delete
    List<User> deleteUsers(List<User> users);

    public String deleteUserById(Long id);
}
