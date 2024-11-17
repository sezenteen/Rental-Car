package com.example.mashintvrees.Service.Implements;

import com.example.mashintvrees.Service.CarService;
import com.example.mashintvrees.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public Car createCar(Car car) {
        return null;
    }

    @Override
    public List<Car> createCars(List<Car> cars) {
        return List.of();
    }

    @Override
    public Optional<Car> getCar(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Car> getCars() {
        return List.of();
    }

    @Override
    public Car updateCar(Car car) {
        return null;
    }

    @Override
    public List<Car> updateCars(List<Car> cars) {
        return List.of();
    }

    @Override
    public String deleteCar(Car car) {
        return "";
    }

    @Override
    public List<Car> deleteCars(List<Car> cars) {
        return List.of();
    }
}
