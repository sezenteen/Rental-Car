package com.example.mashintvrees.model;

import com.example.mashintvrees.model.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@Entity
public class Car extends BaseEntity{
    private String make;
    private String model;
    private int year;
    private String license;
    private BigDecimal dailyPrice;
    private Status status;

    @NotBlank
    @Column(name = "brand", unique = false)
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @NotBlank
    @Column(name = "car_model", unique = false, nullable = false)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Min(1900)
    @Max(2024)
    @Column(name = "year", unique = false, nullable = false)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Pattern(regexp = "[A-Z0-9]+")
    @NotBlank
    @Column(name = "plate_number", unique = true, nullable = false)
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @DecimalMin(value = "0.0", inclusive = false)
    @Column(name = "daily_price", unique = false, nullable = false)
    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status", unique = false, nullable = false)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
