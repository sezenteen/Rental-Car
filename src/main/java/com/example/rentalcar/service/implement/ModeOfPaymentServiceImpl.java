package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.ModeOfPayment;
import com.example.rentalcar.service.ModeOfPaymentService;

import java.util.List;
import java.util.Optional;

public class ModeOfPaymentServiceImpl implements ModeOfPaymentService {
    @Override
    public List<ModeOfPayment> getAllModeOfPayment() {
        return List.of();
    }

    @Override
    public Optional<ModeOfPayment> getModeOfPaymentById(Long id) {
        return Optional.empty();
    }

    @Override
    public ModeOfPayment createModeOfPayment(ModeOfPayment modeOfPayment) {
        return null;
    }

    @Override
    public List<ModeOfPayment> createModeOfPayments(List<ModeOfPayment> modeOfPayments) {
        return List.of();
    }

    @Override
    public ModeOfPayment updateModeOfPayment(ModeOfPayment modeOfPayment) {
        return null;
    }

    @Override
    public String deleteModeOfPayment(Long id) {
        return "";
    }

    @Override
    public List<ModeOfPayment> deleteModeOfPayments(List<ModeOfPayment> modeOfPayments) {
        return List.of();
    }
}
