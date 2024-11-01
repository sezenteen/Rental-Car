package com.example.rentalcar.service;

import com.example.rentalcar.model.entity.User;
import com.example.rentalcar.model.entity.UserType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserTypeService {
    // Get
    List<UserType> getAllUserTypes();

    public Optional<UserType> getUserTypeById(long id);

    // Create
    List<UserType> createUserTypes(List<UserType> userTypes);

    public UserType createUserType(UserType userType);

    // Update
    public UserType updateUserType(UserType userType);

    List<UserType> updateUserTypes(List<UserType> userTypes);

    // Delete
    public String deleteUserTypeById(long id);

    List<UserType> deleteUserTypes(List<UserType> userTypes);
}
