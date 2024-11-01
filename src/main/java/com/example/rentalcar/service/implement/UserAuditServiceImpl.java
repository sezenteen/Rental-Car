package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.UserAudit;
import com.example.rentalcar.service.UserAuditService;

import java.util.List;
import java.util.Optional;

public class UserAuditServiceImpl implements UserAuditService {
    @Override
    public List<UserAudit> getAllUserAudits() {
        return List.of();
    }

    @Override
    public Optional<UserAudit> getUserAuditById(long id) {
        return Optional.empty();
    }

    @Override
    public List<UserAudit> createUserAudits(List<UserAudit> userAudits) {
        return List.of();
    }

    @Override
    public UserAudit createUserAudit(UserAudit userAudit) {
        return null;
    }

    @Override
    public List<UserAudit> updateUserAudits(List<UserAudit> userAudits) {
        return List.of();
    }

    @Override
    public UserAudit updateUserAudit(UserAudit userAudit) {
        return null;
    }

    @Override
    public String deleteUserAudit(long id) {
        return "";
    }

    @Override
    public List<UserAudit> deleteUserAudits(List<UserAudit> userAudits) {
        return List.of();
    }
}
