package com.example.mashintvrees.Service.Implements;

import com.example.mashintvrees.Service.PaymentService;
import com.example.mashintvrees.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public Payment createPayment(Payment payment) {
        return null;
    }

    @Override
    public List<Payment> createPayments(List<Payment> payments) {
        return List.of();
    }

    @Override
    public Optional<Payment> getPayment(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Payment> getPayments() {
        return List.of();
    }

    @Override
    public Payment updatePayment(Payment payment) {
        return null;
    }

    @Override
    public List<Payment> updatePayments(List<Payment> payments) {
        return List.of();
    }

//    @Override
//    public String deletePayment(Long id) {
//        return "";
//    }
//
//    @Override
//    public List<Payment> deletePayments(List<Payment> payments) {
//        return List.of();
//    }
}
