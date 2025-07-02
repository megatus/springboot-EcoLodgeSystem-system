package com.example.Capstone_EcoLodge_Demo;

@RestController
public class products {
    @RequestMapping("")
    public String Greet(){
        
        return "Welcome to Hell";
    }
    @RequestMapping("/about")
    public String about(){
        return "There is nothing Here!!";
    }
}
