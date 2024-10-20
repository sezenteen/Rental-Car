package com.example.rentalcar.model.dtos;

import com.example.rentalcar.model.auth.Role;

import java.util.Set;

public class UserDTO {
    private String username;
    private String password;
    private Set<Role> roles;
    private String firstName;
    private String lastName;
    private int age;
}
