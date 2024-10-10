package com.example.door_spring_mariadb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String hello() {
        return "Hello, I'm demo a SpringBoot and MariaDB deployed with Cloudoor";
    }
}
