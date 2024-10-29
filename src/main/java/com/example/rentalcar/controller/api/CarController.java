package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.Car;
import com.example.rentalcar.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {
    private CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/api/cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping("/api/car")
    public Car addCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping("/api/car/{id}")
    public Optional<Car> getCarById(@PathVariable Long id) {
        return carService.getCarById(id);
    }

    @PutMapping("/api/car")
    public Car updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }

    @DeleteMapping("/api/car/{id}")
    public String deleteCar(@PathVariable Long id) {
        return carService.deleteCarById(id);
    }

    @DeleteMapping("/api/cars")
    public String deleteAllCars(@RequestBody List<Car> cars) {
        return carService.deleteCars(cars).toString();
    }
}
