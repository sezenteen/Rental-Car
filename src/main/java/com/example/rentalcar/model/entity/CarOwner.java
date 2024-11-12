package com.example.rentalcar.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class CarOwner extends BaseEntity {
    private User user;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = false)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
