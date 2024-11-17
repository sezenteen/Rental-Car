package com.example.mashintvrees.controllers;

import com.example.mashintvrees.Service.PaymentService;
import com.example.mashintvrees.model.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PaymentController {
    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // CREATE
    @PostMapping("/payment")
    public Payment createPayment(Payment payment) {
        return paymentService.createPayment(payment);
    }

    @PostMapping("/payments")
    public List<Payment> createPayments(List<Payment> payments) {
        return paymentService.createPayments(payments);
    }

    // READ
    @GetMapping("/payment/{id}")
    public Optional<Payment> getPayment(@PathVariable Long id) {
        return paymentService.getPayment(id);
    }

    @GetMapping("/payments")
    public List<Payment> getPayments() {
        return paymentService.getPayments();
    }

    // UPDATE
    @PutMapping("/payment")
    public Payment updatePayment(Payment payment) {
        return paymentService.updatePayment(payment);
    }

    @PutMapping("/payments")
    public List<Payment> updatePayments(List<Payment> payments) {
        return paymentService.updatePayments(payments);
    }

//    // DELETE
//    @DeleteMapping("/payment")
//    public String deletePayment(Long id) {
//        return paymentService.deletePayment(id);
//    }
//
//    @DeleteMapping("/payments")
//    List<Payment> deletePayments(List<Payment> payments) {
//        return paymentService.deletePayments(payments);
//    }
}
