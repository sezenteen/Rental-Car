package com.example.mashintvrees.controllers;

import com.example.mashintvrees.Service.AdminService;
import com.example.mashintvrees.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {
    AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // CRAETE
    @PostMapping("/admin")
    public Admin createAdmin(@ModelAttribute Admin admin) {
        return adminService.createAdmin(admin);
    }

    // READ
    @GetMapping("/admin")
    public Admin getAdmin(Admin admin) {
        return adminService.getAdmin(admin);
    }

    // UPDATE
    @PutMapping("/admin")
    public Admin updateAdmin(@ModelAttribute Admin admin) {
        return adminService.updateAdmin(admin);
    }

    // DELETE
    @DeleteMapping("/admin")
    public Admin deleteAdmin(@ModelAttribute Admin admin) {
        return adminService.deleteAdmin(admin);
    }
}
