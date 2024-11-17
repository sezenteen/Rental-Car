package com.example.mashintvrees.Service;

import com.example.mashintvrees.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    // CRAETE
    public Payment createPayment(Payment payment);

    List<Payment> createPayments(List<Payment> payments);

    // READ
    Optional<Payment> getPayment(Long id);

    List<Payment> getPayments();

    // UPDATE
    public Payment updatePayment(Payment payment);

    List<Payment> updatePayments(List<Payment> payments);

//    // DELETE
//    public String deletePayment(Long id);
//
//    List<Payment> deletePayments(List<Payment> payments);
}
