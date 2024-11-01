package com.example.rentalcar.service.implement;

import com.example.rentalcar.model.entity.UserType;
import com.example.rentalcar.service.UserTypeService;

import java.util.List;
import java.util.Optional;

public class UserTypeServiceImpl implements UserTypeService {
    @Override
    public List<UserType> getAllUserTypes() {
        return List.of();
    }

    @Override
    public Optional<UserType> getUserTypeById(long id) {
        return Optional.empty();
    }

    @Override
    public List<UserType> createUserTypes(List<UserType> userTypes) {
        return List.of();
    }

    @Override
    public UserType createUserType(UserType userType) {
        return null;
    }

    @Override
    public UserType updateUserType(UserType userType) {
        return null;
    }

    @Override
    public List<UserType> updateUserTypes(List<UserType> userTypes) {
        return List.of();
    }

    @Override
    public String deleteUserTypeById(long id) {
        return "";
    }

    @Override
    public List<UserType> deleteUserTypes(List<UserType> userTypes) {
        return List.of();
    }
}
