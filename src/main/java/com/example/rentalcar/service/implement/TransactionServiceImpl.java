package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.Transaction;
import com.example.rentalcar.service.TransactionService;

import java.util.List;
import java.util.Optional;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public List<Transaction> getAllTransactions() {
        return List.of();
    }

    @Override
    public Optional<Transaction> getTransactionById(Long id) {
        return Optional.empty();
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public List<Transaction> createTransactions(List<Transaction> transactions) {
        return List.of();
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public String deleteTransaction(Long id) {
        return "";
    }

    @Override
    public List<Transaction> deleteTransactions(List<Transaction> transactions) {
        return List.of();
    }
}
