package com.kanaex.SpringBootJPAGetEntities.services;

import com.kanaex.SpringBootJPAGetEntities.entities.Product;
import com.kanaex.SpringBootJPAGetEntities.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }
}
