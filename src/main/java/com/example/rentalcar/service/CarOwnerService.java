package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.Car;
import com.example.rentalcar.model.entity.CarOwner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CarOwnerService {
    // Bvh mashin ezemshigchiin medeelel harah jagsaalt
    List<CarOwner> getAllCarOwners();

    // Neg mashinezemshigchiin medeelel hadgalah
    public CarOwner createCarOwner(CarOwner carOwner);

    // Olon mashin ezemshigchiin medeelel hadgalah
    List<CarOwner> createCarOwners(List<CarOwner> carOwners);

    // Neg Mashin ezemshigchiin medeelel harah
    public Optional<CarOwner> getCarOwnerById(Long id);

    // Neg mashin ezemshigchn medeelel zasah
    public CarOwner updateCarOwner(CarOwner carOwner);

    // Neg mashin ezemshigchiin medeelel ustgah
    public String deleteCarOwnerById(Long id);

    // Olon hereglegchiin medeelel ustgah
    Object deleteCarOwners(List<CarOwner> carOwners);
}
