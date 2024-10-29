package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PaymentService {
    // Get
    List<Payment> getAllPayments();

    public Optional<Payment> getPaymentById(Long id);

    // Create
    public Payment createPayment(Payment payment);

    List<Payment> createPayments(List<Payment> payments);

    // Update
    public Payment updatePayment(Payment payment);

    // Delete
    public String deletePayment(Long id);

    List<Payment> deletePayments(List<Payment> payments);

}
