package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.ReportsAudit;
import com.example.rentalcar.service.ReportsAuditService;

import java.util.List;
import java.util.Optional;

public class ReportsAuditServiceImpl implements ReportsAuditService {
    @Override
    public List<ReportsAudit> getAllReportsAudit() {
        return List.of();
    }

    @Override
    public Optional<ReportsAudit> getReportsAuditById(long id) {
        return Optional.empty();
    }

    @Override
    public ReportsAudit createReportsAudit(ReportsAudit reportsAudit) {
        return null;
    }

    @Override
    public List<ReportsAudit> createReportsAudits(List<ReportsAudit> reportsAudits) {
        return List.of();
    }

    @Override
    public ReportsAudit updateReportsAudit(ReportsAudit reportsAudit) {
        return null;
    }

    @Override
    public String deleteReportsAudit(long id) {
        return "";
    }

    @Override
    public List<ReportsAudit> deleteReportsAudits(List<ReportsAudit> reportsAudits) {
        return List.of();
    }
}
