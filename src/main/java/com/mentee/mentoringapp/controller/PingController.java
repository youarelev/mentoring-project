package com.mentee.mentoringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/ping/{someId}")
    public String ping(@PathVariable("someId") String someId) {
        return someId;
    }
}