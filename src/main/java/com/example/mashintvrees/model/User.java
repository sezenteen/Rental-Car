package com.example.mashintvrees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;

@Entity
public class User extends BaseEntity{
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

    @NotBlank
    @NotEmpty(message = "username заавал бичнэ!")
    @Column(name = "username", unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Size(min = 8)
    @NotEmpty(message = "password оруулна уу!")
    @Column(name = "password", unique = false, nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Email
    @NotBlank
    @NotEmpty(message = "email оруулна уу!")
    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Pattern(regexp = "[0-9]{10}")
    @NotEmpty(message = "Утасны дугаар оруулна уу!")
    @Column(name = "phone_number", unique = true, nullable = false)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @NotEmpty(message = "Хаягаа оруулна уу!")
    @Column(name = "address", unique = false, nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
