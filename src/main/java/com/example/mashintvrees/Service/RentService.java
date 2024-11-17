package com.example.mashintvrees.Service;

import com.example.mashintvrees.model.Rent;

import java.util.List;
import java.util.Optional;

public interface RentService {
    // CREATE
    public Rent createRent(Rent rent);

    List<Rent> createRents(List<Rent> rents);

    // READ
    Optional<Rent> getRentById(Long id);

    List<Rent> getRents();

    // UPDATE
    public Rent updateRent(Rent rent);

    List<Rent> updateRents(List<Rent> rents);

    // DELETE
    public String deleteRentById(Long id);

    List<Rent> deleteRentsByUserId(Long id);
}

