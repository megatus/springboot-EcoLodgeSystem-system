package com.example.Capstone_EcoLodge_Demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String Greet(){
        
        return "Welcome to Hell";
        
    }
    @RequestMapping("/about")
    public String about(){
        return "There is nothing Here!!";
    }
}
