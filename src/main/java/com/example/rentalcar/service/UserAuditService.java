package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.UserAudit;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserAuditService {
    // Get
    List<UserAudit> getAllUserAudits();

    public Optional<UserAudit> getUserAuditById(long id);

    // Create
    List<UserAudit> createUserAudits(List<UserAudit> userAudits);

    public UserAudit createUserAudit(UserAudit userAudit);

    // Update
    List<UserAudit> updateUserAudits(List<UserAudit> userAudits);

    public UserAudit updateUserAudit(UserAudit userAudit);

    // Delete
    public String deleteUserAudit(long id);

    List<UserAudit> deleteUserAudits(List<UserAudit> userAudits);
}
