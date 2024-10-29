package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.Payment;
import com.example.rentalcar.service.PaymentService;

import java.util.List;
import java.util.Optional;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public List<Payment> getAllPayments() {
        return List.of();
    }

    @Override
    public Optional<Payment> getPaymentById(Long id) {
        return Optional.empty();
    }

    @Override
    public Payment createPayment(Payment payment) {
        return null;
    }

    @Override
    public List<Payment> createPayments(List<Payment> payments) {
        return List.of();
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return null;
    }

    @Override
    public String deletePayment(Long id) {
        return "";
    }

    @Override
    public List<Payment> deletePayments(List<Payment> payments) {
        return List.of();
    }
}
