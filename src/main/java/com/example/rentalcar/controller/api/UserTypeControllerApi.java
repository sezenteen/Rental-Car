package com.example.rentalcar.controller.api;

import com.example.rentalcar.model.entity.UserType;
import com.example.rentalcar.service.UserTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserTypeControllerApi {
    UserTypeService userTypeService;

    public UserTypeControllerApi(UserTypeService userTypeService) {
        this.userTypeService = userTypeService;
    }

    // Get
    @GetMapping("/api/usertype/{id}")
    public Optional<UserType> getUserTypeById(@PathVariable Long id) {
        return userTypeService.getUserTypeById(id);
    }

    @GetMapping("/api/usertypes")
    public List<UserType> getAllUserTypes() {
        return userTypeService.getAllUserTypes();
    }

    // Create
    @PostMapping("/api/usertype")
    public UserType createUserType(@RequestBody UserType userType) {
        return userTypeService.createUserType(userType);
    }

    @PostMapping("/api/usertypes")
    public List<UserType> createUserTypes(@RequestBody List<UserType> userTypes) {
        return userTypeService.createUserTypes(userTypes);
    }

    // Update
    @PutMapping("/api/usertype")
    public UserType updateUserType(@RequestBody UserType userType) {
        return userTypeService.updateUserType(userType);
    }

    @PutMapping("/api/usertypes")
    public List<UserType> updateUserTypes(@RequestBody List<UserType> userTypes) {
        return userTypeService.updateUserTypes(userTypes);
    }

    // Delete
    @DeleteMapping("/api/usertype")
    public String deleteUserTypeById(@RequestBody Long id) {
        return userTypeService.deleteUserTypeById(id);
    }

    @DeleteMapping("/api/usertypes")
    public List<UserType> deleteUserTypes(@RequestBody List<UserType> userTypes) {
        return userTypeService.deleteUserTypes(userTypes);
    }
}
