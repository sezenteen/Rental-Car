package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.CarOwner;
import com.example.rentalcar.service.CarOwnerService;

import java.util.List;
import java.util.Optional;

public class CarOwnerImpl implements CarOwnerService {
    @Override
    public List<CarOwner> getAllCarOwners() {
        return List.of();
    }

    @Override
    public CarOwner createCarOwner(CarOwner carOwner) {
        return null;
    }

    @Override
    public List<CarOwner> createCarOwners(List<CarOwner> carOwners) {
        return List.of();
    }

    @Override
    public Optional<CarOwner> getCarOwnerById(Long id) {
        return Optional.empty();
    }

    @Override
    public CarOwner updateCarOwner(CarOwner carOwner) {
        return null;
    }

    @Override
    public String deleteCarOwnerById(Long id) {
        return "";
    }

    @Override
    public Object deleteCarOwners(List<CarOwner> carOwners) {
        return null;
    }
}
