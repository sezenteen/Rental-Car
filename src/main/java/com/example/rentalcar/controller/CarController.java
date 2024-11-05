package com.example.rentalcar.controller;

import com.example.rentalcar.repository.BrandRepository;
import com.example.rentalcar.repository.CarRepository;
import com.example.rentalcar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarController {
    private final BrandRepository brandRepository;
    private CarRepository carRepository;
    private final CarService carService;

    @Autowired
    public CarController(CarService carService, CarRepository carRepository, BrandRepository brandRepository) {
        this.carService = carService;
        this.carRepository = carRepository;
        this.brandRepository = brandRepository;
    }


}
