package com.example.mashintvrees.repository;

import com.example.mashintvrees.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
