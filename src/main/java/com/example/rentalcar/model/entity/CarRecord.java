package com.example.rentalcar.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CarRecord extends BaseEntity {
    private CarOwner carOwner;
    private Car car;
    private Date dateAdded;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    public CarOwner getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    @OneToOne
    @JoinColumn(name = "car_id", nullable = false)
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Column(name = "added_date")
    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
