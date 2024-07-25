package com.ust.geteway.Feign_Product_Service.service;

import com.ust.geteway.Feign_Product_Service.resource.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return showProductList();
    }

    @Override
    public List<Product> findByCategory(String category) {
        System.out.println("<<<" + category + ">>>");
        List<Product> list = showProductList().stream().filter((product) -> (product.getName().equals(category)))
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
    }
    @Override

    public Product findById(int id) {

        //return showProductList().stream().filter(product -> product.getProductId() == id).findAny().get();
        return showProductList()
                .stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Product not found"));


    }
    private List<Product> showProductList() {

        return Arrays.asList(

                new Product(1, "iPhone 14"),
                new Product(2, "Split phone"),
                new Product(3, "Grand Pixels"),
                new Product(4, "iNSPIRON"),
                new Product(5, "Thinkpad")

        );

    }
    public Product fallbackFindById(int id, Exception ex) {
        // Fallback logic when the circuit is open or an exception occurs
        return new Product(-1, "Fallback Product");
    }
}
