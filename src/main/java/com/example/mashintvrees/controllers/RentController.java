package com.example.mashintvrees.controllers;

import com.example.mashintvrees.Service.RentService;
import com.example.mashintvrees.model.Rent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class RentController {
    RentService rentService;

    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    // CREATE
    @PostMapping("/rent")
    public Rent createRent(Rent rent) {
        return rentService.createRent(rent);
    }

    @PostMapping("/rents")
    List<Rent> createRents(List<Rent> rents) {
        return rentService.createRents(rents);
    }

    // READ
    @GetMapping("/rent/{id}")
    public Optional<Rent> getRentById(@PathVariable Long id) {
        return rentService.getRentById(id);
    }

    @GetMapping("/rents")
    public List<Rent> getRents() {
        return rentService.getRents();
    }

    // UPDATE
    @PutMapping("/rent")
    public Rent updateRent(Rent rent) {
        return rentService.updateRent(rent);
    }

    @PutMapping("/rents")
    public List<Rent> updateRents(List<Rent> rents) {
        return rentService.updateRents(rents);
    }

    // DELETE
    @DeleteMapping("/rent")
    public String deleteRentById(@PathVariable Long id) {
        return rentService.deleteRentById(id);
    }

    @DeleteMapping("/rents")
    public List<Rent> deleteRentsByUserId(@PathVariable Long userId) {
        return rentService.deleteRentsByUserId(userId);
    }
}
