package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.TransactionAudit;
import com.example.rentalcar.service.TransactionAuditService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionAuditController {
    TransactionAuditService transactionAuditService;

    public TransactionAuditController(TransactionAuditService transactionAuditService) {
        this.transactionAuditService = transactionAuditService;
    }

    @GetMapping("/api/transactionaudits")
    public List<TransactionAudit> getAllTransactionAudits() {
        return transactionAuditService.getAllTransactionAudit();
    }

    @GetMapping("/api/transactionaudit/{id}")
    public Optional<TransactionAudit> getTransactionAuditById(@PathVariable Long id) {
        return transactionAuditService.getTransactionAuditById(id);
    }

    @PostMapping("/api/transactionaudit")
    public TransactionAudit createTransactionAudit(@RequestBody TransactionAudit transactionAudit) {
        return transactionAuditService.createTransactionAudit(transactionAudit);
    }

    @PostMapping("/api/transactionaudits")
    public List<TransactionAudit> createTransactionAudits(@RequestBody List<TransactionAudit> transactionAudits) {
        return transactionAuditService.createTransactionAudits(transactionAudits);
    }

    @PutMapping("/api/transactionaudit")
    public TransactionAudit updateTransactionAudit(@RequestBody TransactionAudit transactionAudit) {
        return transactionAuditService.updateTransactionAudit(transactionAudit);
    }

    @DeleteMapping("/api/transactionaudit/{id}")
    public String deleteTransactionAudit(@PathVariable Long id) {
        return transactionAuditService.deleteTransactionAudit(id);
    }

    @DeleteMapping("/api/transactionaudits")
    public List<TransactionAudit> deleteTransactionAudits(@RequestBody List<TransactionAudit> transactionAudits) {
        return transactionAuditService.deleteTransactionAudits(transactionAudits);
    }
}
