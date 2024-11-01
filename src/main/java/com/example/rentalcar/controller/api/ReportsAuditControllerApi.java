package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.ReportsAudit;
import com.example.rentalcar.service.ReportsAuditService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReportsAuditControllerApi {
    ReportsAuditService reportsAuditService;

    public ReportsAuditControllerApi(ReportsAuditService reportsAuditService) {
        this.reportsAuditService = reportsAuditService;
    }

    @GetMapping("/api/reportsaudits")
    public List<ReportsAudit> getAllReportsAudits() {
        return reportsAuditService.getAllReportsAudit();
    }

    @GetMapping("/api/reportsaudit/{id}")
    public Optional<ReportsAudit> getReportsAuditById(@PathVariable Long id) {
        return reportsAuditService.getReportsAuditById(id);
    }

    @PostMapping("/api/reportsaudit")
    public ReportsAudit createReportsAudit(@RequestBody ReportsAudit reportsAudit) {
        return reportsAuditService.createReportsAudit(reportsAudit);
    }

    @PostMapping("/api/reportsaudits")
    public List<ReportsAudit> createReportsAudits(@RequestBody List<ReportsAudit> reportsAudits) {
        return reportsAuditService.createReportsAudits(reportsAudits);
    }

    @PutMapping("/api/reportsaudit")
    public ReportsAudit updateReportsAudit(@RequestBody ReportsAudit reportsAudit) {
        return reportsAuditService.updateReportsAudit(reportsAudit);
    }

    @DeleteMapping("/api/reportsaudit/{id}")
    public String deleteReportsAudit(@PathVariable Long id) {
        return reportsAuditService.deleteReportsAudit(id);
    }

    @DeleteMapping("/api/reportsaudits")
    public List<ReportsAudit> deleteReportsAudits(List<ReportsAudit> reportsAudits) {
        return reportsAuditService.deleteReportsAudits(reportsAudits);
    }
}
