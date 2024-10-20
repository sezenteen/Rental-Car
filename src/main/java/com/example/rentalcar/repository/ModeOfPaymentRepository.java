package com.example.rentalcar.repository;

import com.example.rentalcar.model.entity.ModeOfPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeOfPaymentRepository extends JpaRepository<ModeOfPayment, Long> {
}
