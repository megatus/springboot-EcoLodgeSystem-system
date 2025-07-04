package com.example.Capstone_EcoLodge_Demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Capstone_EcoLodge_Demo.Model.Product;


@Service
public class ProductService {

    List<Product> products = Arrays.asList(
        new Product(101, "Phone", 1000),
        new Product(102, "Camera", 2000),
        new Product(103, "Earbuds", 3000)
    );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductsByID(int prodID) {
        return products.stream()
                .filter(p -> p.getProdID() == prodID)
                .findFirst()
                .orElse(null);
    }
}
