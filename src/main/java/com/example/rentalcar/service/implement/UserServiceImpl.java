package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.User;
import com.example.rentalcar.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> createUsers(List<User> users) {
        return List.of();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public List<User> updateUsers(List<User> users) {
        return List.of();
    }

    @Override
    public List<User> deleteUsers(List<User> users) {
        return List.of();
    }

    @Override
    public String deleteUserById(Long id) {
        return "";
    }
}
