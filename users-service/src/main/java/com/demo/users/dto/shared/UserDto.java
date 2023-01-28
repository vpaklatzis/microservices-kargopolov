package com.demo.users.dto.shared;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserDto implements Serializable {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2, message = "First name must not be less than 2 characters")
    private String name;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, message = "Last name must not be less than 2 characters")
    private String surname;

    @NotNull(message = "Email cannot be null")
    @Email
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max = 16, message = "Password must be equal to or larger than 8 characters and not be more    than 16 characters")
    private String password;

    private String userId;

    private String encryptedPassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
}
