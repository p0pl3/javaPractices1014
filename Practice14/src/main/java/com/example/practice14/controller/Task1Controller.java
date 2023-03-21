package com.example.practice14.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Task1Controller {
    @GetMapping("/home")
    public String home() {
        return "home_page";
    }
}
