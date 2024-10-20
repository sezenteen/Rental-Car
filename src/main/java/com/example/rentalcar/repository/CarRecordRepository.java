package com.example.rentalcar.repository;

import com.example.rentalcar.model.entity.CarRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRecordRepository extends JpaRepository<CarRecord, Long> {
}
