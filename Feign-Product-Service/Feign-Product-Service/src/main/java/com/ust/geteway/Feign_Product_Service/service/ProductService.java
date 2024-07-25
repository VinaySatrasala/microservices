package com.ust.geteway.Feign_Product_Service.service;

import com.ust.geteway.Feign_Product_Service.resource.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product> findByCategory(String category);
    Product findById(int id);
}
