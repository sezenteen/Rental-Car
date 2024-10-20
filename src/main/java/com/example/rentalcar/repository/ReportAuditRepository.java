package com.example.rentalcar.repository;

import com.example.rentalcar.model.entity.ReportsAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportAuditRepository extends JpaRepository<ReportsAudit, Long> {
}
