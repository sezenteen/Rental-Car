package com.example.rentalcar.repository;

import com.example.rentalcar.model.entity.CarOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOwnerRepository extends JpaRepository<CarOwner, Long> {
}
