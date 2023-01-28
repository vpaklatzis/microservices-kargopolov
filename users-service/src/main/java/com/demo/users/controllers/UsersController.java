package com.demo.users.controllers;

import com.demo.users.dto.CreateUserRequest;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    private final Environment environment;

    public UsersController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/status/check")
    public String getStatus() {
        return "Working on port " + environment.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
        return "Create user";
    }
}
