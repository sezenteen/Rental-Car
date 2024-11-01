package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.ModeOfPayment;
import com.example.rentalcar.service.ModeOfPaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModeOfPaymentControllerApi {
    ModeOfPaymentService modeOfPaymentService;

    public ModeOfPaymentControllerApi(ModeOfPaymentService modeOfPaymentService) {
        this.modeOfPaymentService = modeOfPaymentService;
    }

    @GetMapping("/api/modeofpayments")
    public List<ModeOfPayment> getAllModeOfPayment() {
        return modeOfPaymentService.getAllModeOfPayment();
    }

    @GetMapping("/api/modeofpayment/{id}")
    public Optional<ModeOfPayment> getModeOfPaymentById(@PathVariable Long id) {
        return modeOfPaymentService.getModeOfPaymentById(id);
    }

    @PostMapping("/api/modeofpayment")
    public ModeOfPayment createModeOfPayment(@RequestBody ModeOfPayment modeOfPayment) {
        return modeOfPaymentService.createModeOfPayment(modeOfPayment);
    }

    @PostMapping("/api/modeofapyments")
    public List<ModeOfPayment> createModeOfPayments(@RequestBody List<ModeOfPayment> modeOfPayments) {
        return modeOfPaymentService.createModeOfPayments(modeOfPayments);
    }

    @PutMapping("/api/modeofpayment")
    public ModeOfPayment updateModeOfPayment(@RequestBody ModeOfPayment modeOfPayment) {
        return modeOfPaymentService.updateModeOfPayment(modeOfPayment);
    }

    @DeleteMapping("/api/modeofpayment/{id}")
    public String deleteModeOfPayment(@PathVariable Long id) {
        return modeOfPaymentService.deleteModeOfPayment(id);
    }

    @DeleteMapping("/api/modeofpayments")
    public List<ModeOfPayment> deleteModeOfPayments(@RequestBody List<ModeOfPayment> modeOfPayments) {
        return modeOfPaymentService.deleteModeOfPayments(modeOfPayments);
    }
}
