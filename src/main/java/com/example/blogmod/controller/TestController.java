package com.example.blogmod.controller;

import com.example.blogmod.entity.User;
import com.example.blogmod.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final UserService userService;

    @GetMapping("/create")
    public User createUser(){
        return userService.createTestUser();
    }
}
