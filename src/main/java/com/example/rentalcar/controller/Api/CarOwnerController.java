package com.example.rentalcar.controller.Api;

import com.example.rentalcar.model.entity.CarOwner;
import com.example.rentalcar.service.CarOwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarOwnerController {
    private CarOwnerService carOwnerService;

    public CarOwnerController(CarOwnerService carOwnerService) {
        this.carOwnerService = carOwnerService;
    }

    @GetMapping("/api/carowners")
    public List<CarOwner> getAllCarOwners() {
        return carOwnerService.getAllCarOwners();
    }

    @PostMapping("/api/carowner")
    public CarOwner addCarOwner(@RequestBody CarOwner carOwner) {
        return carOwnerService.createCarOwner(carOwner);
    }

    @GetMapping("/api/carowner/{id}")
    public Optional<CarOwner> getCarOwner(@PathVariable Long id) {
        return carOwnerService.getCarOwnerById(id);
    }

    @PutMapping("/api/carowner")
    public CarOwner updateCarOwner(@RequestBody CarOwner carOwner) {
        return carOwnerService.updateCarOwner(carOwner);
    }

    @DeleteMapping("/api/car/{id}")
    public String deleteCarOwner(@PathVariable Long id) {
        return carOwnerService.deleteCarOwnerById(id);
    }

    @DeleteMapping("/api/carowners")
    public String deleteAllCarOwners(@RequestBody List<CarOwner> carOwners) {
        return carOwnerService.deleteCarOwners(carOwners).toString();
    }
}
