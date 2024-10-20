package com.example.rentalcar.repository;

import com.example.rentalcar.model.entity.UserAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuditRepository extends JpaRepository<UserAudit, Long> {
}
