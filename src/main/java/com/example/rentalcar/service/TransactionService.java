package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TransactionService {
    // Get
    List<Transaction> getAllTransactions();

    public Optional<Transaction> getTransactionById(Long id);

    // Create
    public Transaction createTransaction(Transaction transaction);

    List<Transaction> createTransactions(List<Transaction> transactions);

    // Update
    public Transaction updateTransaction(Transaction transaction);

    // Delete
    public String deleteTransaction(Long id);

    List<Transaction> deleteTransactions(List<Transaction> transactions);
}
