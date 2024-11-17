package com.example.mashintvrees.Service;

import com.example.mashintvrees.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    // CREATE
    public Car createCar(Car car);

    List<Car> createCars(List<Car> cars);

    // READ
    Optional<Car> getCar(Long id);

    List<Car> getCars();

    // UPDATE
    public Car updateCar(Car car);

    List<Car> updateCars(List<Car> cars);

    // DELETE
    public String deleteCar(Car car);

    List<Car> deleteCars(List<Car> cars);
}
