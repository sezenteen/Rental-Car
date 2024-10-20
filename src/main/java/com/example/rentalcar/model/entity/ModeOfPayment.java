package com.example.rentalcar.model.entity;

import com.example.rentalcar.model.entity.enums.PaymentType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ModeOfPayment extends BaseEntity {
    private PaymentType paymentType;

    @Column(name = "payment_type")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
