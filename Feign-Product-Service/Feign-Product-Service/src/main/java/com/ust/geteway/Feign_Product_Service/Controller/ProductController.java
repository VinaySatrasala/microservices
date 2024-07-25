package com.ust.geteway.Feign_Product_Service.Controller;

import com.ust.geteway.Feign_Product_Service.resource.Product;
import com.ust.geteway.Feign_Product_Service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-service")
public class ProductController {
    @Autowired
    ProductService product;



    @GetMapping("/products")
    public List<Product> findAll(){
        return product.findAll();
    }

    @GetMapping("/products-by-category/{category}")
    public List<Product> findByCategory(@PathVariable("category") String category){
        return product.findByCategory(category);
    }

    @GetMapping("/products-by-id/{id}")
    public Product findById(@PathVariable("id") int id) {
        return product.findById(id);
    }



}
