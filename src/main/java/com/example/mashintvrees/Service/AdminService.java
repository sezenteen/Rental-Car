package com.example.mashintvrees.Service;

import com.example.mashintvrees.model.Admin;

public interface AdminService {
    // CREATE
    public Admin createAdmin(Admin admin);

    // READ
    public Admin getAdmin(Admin admin);

    // UPDATE
    public Admin updateAdmin(Admin admin);

    // DELETE
    public Admin deleteAdmin(Admin admin);
}
