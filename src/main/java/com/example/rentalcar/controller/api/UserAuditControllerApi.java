package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.UserAudit;
import com.example.rentalcar.service.UserAuditService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserAuditControllerApi {
    UserAuditService userAuditService;

    public UserAuditControllerApi(UserAuditService userAuditService) {
        this.userAuditService = userAuditService;
    }

    // Get
    @GetMapping("/api/useraudit/{id}")
    public Optional<UserAudit> getUserAuditById(@PathVariable Long id) {
        return userAuditService.getUserAuditById(id);
    }

    @GetMapping("/api/useraudits")
    public List<UserAudit> getAllUserAudits() {
        return userAuditService.getAllUserAudits();
    }

    // Create
    @PostMapping("/api/useraudit")
    public UserAudit createUserAudit(@RequestBody UserAudit userAudit) {
        return userAuditService.createUserAudit(userAudit);
    }

    @PostMapping("/api/useraudits")
    public List<UserAudit> createUserAudits(@RequestBody List<UserAudit> userAudits) {
        return userAuditService.createUserAudits(userAudits);
    }

    // Update
    @PutMapping("/api/useraudit")
    public UserAudit updateUserAudit(@RequestBody UserAudit userAudit) {
        return userAuditService.updateUserAudit(userAudit);
    }

    @PutMapping("/api/useraudits")
    public List<UserAudit> updateUserAudits(@RequestBody List<UserAudit> userAudits) {
        return userAuditService.updateUserAudits(userAudits);
    }

    // Delete
    @DeleteMapping("/api/useraudit/{id}")
    public String deleteUserAudit(@PathVariable Long id) {
        return userAuditService.deleteUserAudit(id);
    }

    @DeleteMapping("/api/useraudits")
    public List<UserAudit> deleteUserAudits(@RequestBody List<UserAudit> userAudits) {
        return userAuditService.deleteUserAudits(userAudits);
    }
}
