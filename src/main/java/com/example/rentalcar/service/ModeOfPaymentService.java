package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.ModeOfPayment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ModeOfPaymentService {
    // Get
    List<ModeOfPayment> getAllModeOfPayment();

    public Optional<ModeOfPayment> getModeOfPaymentById(Long id);

    // Create
    public ModeOfPayment createModeOfPayment(ModeOfPayment modeOfPayment);

    List<ModeOfPayment> createModeOfPayments(List<ModeOfPayment> modeOfPayments);

    // Update
    public ModeOfPayment updateModeOfPayment(ModeOfPayment modeOfPayment);

    // Delete
    public String deleteModeOfPayment(Long id);

    List<ModeOfPayment> deleteModeOfPayments(List<ModeOfPayment> modeOfPayments);
}
