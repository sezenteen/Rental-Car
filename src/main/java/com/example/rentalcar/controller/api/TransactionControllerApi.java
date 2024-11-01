package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.Transaction;
import com.example.rentalcar.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionControllerApi {
    TransactionService transactionService;

    public TransactionControllerApi(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/api/transanctions")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/api/transaction/{id}")
    public Optional<Transaction> getTransactionById(@PathVariable Long id) {
        return transactionService.getTransactionById(id);
    }

    @PostMapping("/api/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @PostMapping("/api/transactions")
    public List<Transaction> createTransactions(@RequestBody List<Transaction> transactions) {
        return transactionService.createTransactions(transactions);
    }

    @PutMapping("/api/transaction")
    public Transaction updateTransaction(@RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }

    @DeleteMapping("/api/transaction/{id}")
    public String deleteTransaction(@PathVariable Long id) {
        return transactionService.deleteTransaction(id);
    }

    @DeleteMapping("/api/transactions")
    public List<Transaction> deleteTransactions(@RequestBody List<Transaction> transactions) {
        return transactionService.deleteTransactions(transactions);
    }
}
