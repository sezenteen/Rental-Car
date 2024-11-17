package com.example.mashintvrees.controllers;

import com.example.mashintvrees.Service.CarService;
import com.example.mashintvrees.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    // CREATE
    @PostMapping("/car")
    public Car createCar(Car car) {
        return carService.createCar(car);
    }

    @PostMapping("/cars")
    public List<Car> createCars(List<Car> cars) {
        return carService.createCars(cars);
    }

    // READ
    @GetMapping("/car/{id}")
    public Optional<Car> getCar(@PathVariable Long id) {
        return carService.getCar(id);
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    // UPDATE
    @PutMapping("/car")
    public Car updateCar(Car car) {
        return carService.updateCar(car);
    }

    @PutMapping("/cars")
    public List<Car> updateCars(List<Car> cars) {
        return carService.updateCars(cars);
    }

    // DELETE
    @DeleteMapping("/car")
    public String deleteCar(Car car) {
        return carService.deleteCar(car);
    }

    @DeleteMapping("/cars")
    public List<Car> deleteCars(List<Car> cars) {
        return carService.deleteCars(cars);
    }
}
