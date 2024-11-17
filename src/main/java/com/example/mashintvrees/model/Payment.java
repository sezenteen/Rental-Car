package com.example.mashintvrees.model;

import com.example.mashintvrees.model.enums.Method;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Payment extends BaseEntity{
    private Rent rent;
    private Date paymentDate;
    private BigDecimal amount;
    private Method method;

    @OneToOne
    @JoinColumn(name = "rent_id", nullable = false)
    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Column(name = "payment_date", nullable = false, unique = false)
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @DecimalMin(value = "0.0", inclusive = false)
    @Column(name = "amount", nullable = false, unique = false)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_type", nullable = false, unique = false)
    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
