package com.kampanya.product.controller;

import com.kampanya.product.model.Product;
import com.kampanya.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("add")
    public ResponseEntity<Product> add(@RequestBody Product product) {


        this.productService.add(product);
        return ResponseEntity.ok(product);
    }
}