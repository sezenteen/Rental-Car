package com.example.mashintvrees.Service;

import com.example.mashintvrees.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    // CREATE
    public User createUser(User user);

    List<User> createUsers(List<User> users);

    // READ
    List<User> getUsers();

    Optional<User> getUser(Long id);

    // UPDATE
    public User updateUser(Long id, User user);

    List<User> updateUsers(List<User> users);

    // DELETE
    public String deleteUser(Long id);

    List<User> deleteUsers(List<User> users);

}
