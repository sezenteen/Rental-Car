package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.ReportsAudit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReportsAuditService {
    // Get
    List<ReportsAudit> getAllReportsAudit();

    public Optional<ReportsAudit> getReportsAuditById(long id);

    // Create
    public ReportsAudit createReportsAudit(ReportsAudit reportsAudit);

    List<ReportsAudit> createReportsAudits(List<ReportsAudit> reportsAudits);

    // Update
    public ReportsAudit updateReportsAudit(ReportsAudit reportsAudit);

    // Delete
    public String deleteReportsAudit(long id);

    List<ReportsAudit> deleteReportsAudits( List<ReportsAudit> reportsAudits);
}
