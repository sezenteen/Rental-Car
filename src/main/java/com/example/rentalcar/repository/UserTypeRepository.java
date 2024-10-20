package com.example.rentalcar.repository;

import com.example.rentalcar.model.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
