package com.example.mashintvrees.Service.Implements;

import com.example.mashintvrees.Service.UserService;
import com.example.mashintvrees.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public List<User> createUsers(List<User> users) {
        return List.of();
    }

    @Override
    public List<User> getUsers() {
        return List.of();
    }

    @Override
    public Optional<User> getUser(Long id) {
        return Optional.empty();
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public List<User> updateUsers(List<User> users) {
        return List.of();
    }

    @Override
    public String deleteUser(Long id) {
        return "";
    }

    @Override
    public List<User> deleteUsers(List<User> users) {
        return List.of();
    }
}
