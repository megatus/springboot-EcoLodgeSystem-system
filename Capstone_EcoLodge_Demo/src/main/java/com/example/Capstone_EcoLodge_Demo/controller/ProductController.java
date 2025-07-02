package com.example.Capstone_EcoLodge_Demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.WebApp.WebApplication.Model.Product;
import com.WebApp.WebApplication.Service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    public Product getProduct(int prodID){
        return service.getProductsByID(prodID);
    }
}