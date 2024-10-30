package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public interface CarService {
    // Bvh mashinii medeelel harah jagsaalt
    List<Car> getAllCars();

    // Neg mashinii medeelel hadgalah
    public Car createCar(Car car);

    // Olon mashinii medeelel hadgalah
    List<Car> createCars(List<Car> cars);

    // Neg Mashinii medeelel harah
    public Optional<Car> getCarById(Long id);

    // Neg mashinii medeelel zasah
    public Car updateCar(Car car);

    // Neg mashinii medeelel ustgah
    public String deleteCarById(Long id);

    List<Car> deleteAllCars();
}
