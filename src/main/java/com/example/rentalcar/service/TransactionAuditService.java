package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.LocationTurnover;
import com.example.rentalcar.model.entity.TransactionAudit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TransactionAuditService {
    // Get
    List<TransactionAudit> getAllTransactionAudit();

    public Optional<TransactionAudit> getTransactionAuditById(Long id);

    // Create
    List<TransactionAudit> createTransactionAudits(List<TransactionAudit> transactionAudits);

    public TransactionAudit createTransactionAudit(TransactionAudit transactionAudit);

    // Update
    public TransactionAudit updateTransactionAudit(TransactionAudit transactionAudit);

    // Delete
    public String deleteTransactionAudit(Long id);

    List<TransactionAudit> deleteTransactionAudits(List<TransactionAudit> transactionAudits);
}
