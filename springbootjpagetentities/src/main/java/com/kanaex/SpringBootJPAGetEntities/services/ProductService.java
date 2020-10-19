package com.kanaex.SpringBootJPAGetEntities.services;

import com.kanaex.SpringBootJPAGetEntities.entities.Product;

public interface ProductService {
    public Iterable<Product> findAll();
}
