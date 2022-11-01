package com.kampanya.product.service;

import com.kampanya.product.model.Product;
import com.kampanya.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void add(Product product){
        System.out.println(product.getName());
         this.productRepository.save(product);
    }


}
