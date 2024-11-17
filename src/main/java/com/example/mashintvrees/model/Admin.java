package com.example.mashintvrees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Admin extends BaseEntity{
    private String username;
    private String password;

    @NotEmpty(message = "Username оруулна уу!")
    @Column(unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Size(min = 12)
    @NotEmpty(message = "password оруулна уу!")
    @Column(nullable = false, unique = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
