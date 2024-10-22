package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.Car;
import com.example.rentalcar.service.CarService;

import java.util.List;
import java.util.Optional;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars() {
        return List.of();
    }

    @Override
    public Car createCar(Car car) {
        return null;
    }

    @Override
    public List<Car> createCars(List<Car> cars) {
        return List.of();
    }

    @Override
    public Optional<Car> getCarById(Long id) {
        return Optional.empty();
    }

    @Override
    public Car updateCar(Car car) {
        return null;
    }

    @Override
    public String deleteCarById(Long id) {
        return "";
    }
}
