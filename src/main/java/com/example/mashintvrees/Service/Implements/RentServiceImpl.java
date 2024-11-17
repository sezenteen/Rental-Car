package com.example.mashintvrees.Service.Implements;

import com.example.mashintvrees.Service.RentService;
import com.example.mashintvrees.model.Rent;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService {
    @Override
    public Rent createRent(Rent rent) {
        return null;
    }

    @Override
    public List<Rent> createRents(List<Rent> rents) {
        return List.of();
    }


    @Override
    public Optional<Rent> getRentById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Rent> getRents() {
        return List.of();
    }


    @Override
    public Rent updateRent(Rent rent) {
        return null;
    }

    @Override
    public List<Rent> updateRents(List<Rent> rents) {
        return List.of();
    }

    @Override
    public String deleteRentById(Long id) {
        return "";
    }

    @Override
    public List<Rent> deleteRentsByUserId(Long id) {
        return List.of();
    }
}
