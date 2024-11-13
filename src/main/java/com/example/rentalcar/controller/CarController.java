package com.example.rentalcar.controller;

import com.example.rentalcar.model.entity.Brand;
import com.example.rentalcar.model.entity.Car;
import com.example.rentalcar.repository.BrandRepository;
import com.example.rentalcar.repository.CarRepository;
import com.example.rentalcar.service.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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

    // List all cars
    @GetMapping("/cars")
    public ModelAndView showAllCars(ModelAndView modelAndView) {
        modelAndView.addObject("cars", carRepository.findAll());
        modelAndView.addObject("brands", brandRepository.findAll());
        modelAndView.addObject("car", new Car());
        modelAndView.setViewName("cars");
        return modelAndView;
    }

    // Show car by ID
    @GetMapping("/car/{id}")
    public String Car(Model model, @PathVariable("id") Long id) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            model.addAttribute("car", car.get());
        } else {
            model.addAttribute("error", "Car not found" );
        }
        return "car";
    }

    // Show form to create a new car
    @GetMapping("/car/new")
    public ModelAndView createNewCar(ModelAndView modelAndView) {
        Car car = new Car();
        modelAndView.addObject("car", car);
        modelAndView.addObject("brands", brandRepository.findAll());
        modelAndView.addObject("car", new Car());
        modelAndView.setViewName("car");
        return modelAndView;
    }

    // Handle form submission for creating a car
    @PostMapping("/car")
    public String saveCar(@ModelAttribute("car") Car car, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "car/car-form";
        }
        carService.createCar(car);
        return "redirect:/cars";
    }

    // Show form to edit an exiting car
    @GetMapping("/car/edit/{id}")
    public ModelAndView editCarForm(@PathVariable("id") Long id, ModelAndView modelAndView) {
        Optional<Car> car = carRepository.findById(id);
        if (car.isPresent()) {
            modelAndView.addObject("car", car.get());
            modelAndView.setViewName("car/car-form");
        } else {
            modelAndView.setViewName("error/404");
        }
        return modelAndView;
    }

    // Handle form submission for updating a car
    @PostMapping("/car/edit/{id}")
    public String updateCar(@PathVariable("id") Long id, @Valid @ModelAttribute("car") Car car, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "car/car-form";
        }
        car.setId(id);
        carService.updateCar(car);
        return "redirect:/cars";
    }

    // Delete car by ID
    @GetMapping("/car/delete/{id}")
    public String deleteCar(@PathVariable("id") Long id) {
        carRepository.deleteById(id);
        return "redirect:/cars";
    }


}
