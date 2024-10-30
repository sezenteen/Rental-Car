package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.TransactionAudit;
import com.example.rentalcar.service.TransactionAuditService;

import java.util.List;
import java.util.Optional;

public class TransactionAuditServiceImpl implements TransactionAuditService {
    @Override
    public List<TransactionAudit> getAllTransactionAudit() {
        return List.of();
    }

    @Override
    public Optional<TransactionAudit> getTransactionAuditById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<TransactionAudit> createTransactionAudits(List<TransactionAudit> transactionAudits) {
        return List.of();
    }

    @Override
    public TransactionAudit createTransactionAudit(TransactionAudit transactionAudit) {
        return null;
    }

    @Override
    public TransactionAudit updateTransactionAudit(TransactionAudit transactionAudit) {
        return null;
    }

    @Override
    public String deleteTransactionAudit(Long id) {
        return "";
    }

    @Override
    public List<TransactionAudit> deleteTransactionAudits(List<TransactionAudit> transactionAudits) {
        return List.of();
    }
}
