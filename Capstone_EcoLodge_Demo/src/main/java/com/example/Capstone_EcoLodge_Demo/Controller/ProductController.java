package com.example.Capstone_EcoLodge_Demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Capstone_EcoLodge_Demo.model.Product;
import com.example.Capstone_EcoLodge_Demo.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{prodID}")
    public Product getProduct(@PathVariable int prodID) {
        return service.getProductsByID(prodID);
    }
}
