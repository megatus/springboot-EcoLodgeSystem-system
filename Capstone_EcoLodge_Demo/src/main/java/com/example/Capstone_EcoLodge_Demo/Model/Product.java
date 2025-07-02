package com.example.Capstone_EcoLodge_Demo.model;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int prodID;
    private String prodName;
    private int prodPrice;

    public Product() {
    }
}
