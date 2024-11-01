package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.Payment;
import com.example.rentalcar.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentControllerApi {
    PaymentService paymentService;

    public PaymentControllerApi(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/api/payments")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/api/payment/{id}")
    public Optional<Payment> getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping("/api/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @PostMapping("/api/payments")
    public List<Payment> createPayments(@RequestBody List<Payment> payments) {
        return paymentService.createPayments(payments);
    }

    @PutMapping("/api/payment")
    public Payment updatePayment(@RequestBody Payment payment) {
        return paymentService.updatePayment(payment);
    }

    @DeleteMapping("/api/payment/{id}")
    public String deletePayment(@PathVariable Long id) {
        return paymentService.deletePayment(id);
    }

    @DeleteMapping("/api/payments")
    public List<Payment> deletePayments(@RequestBody List<Payment> payments) {
        return paymentService.deletePayments(payments);
    }
}
