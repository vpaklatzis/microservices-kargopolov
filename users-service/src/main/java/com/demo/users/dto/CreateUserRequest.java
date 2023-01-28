package com.demo.users.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequest {
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
}
