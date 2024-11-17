package com.example.mashintvrees.repository;

import com.example.mashintvrees.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
