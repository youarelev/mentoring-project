package com.mentee.mentoringapp.controller;

import com.mentee.mentoringapp.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/auth")
    public String auth(@RequestBody User user) {
        return user.getId() + " " + user.getEmail() + " " + user.getPassword() + " " + user.getName();
    }
}