package com.kanaex.SpringBootJPAGetEntities.repositories;

import com.kanaex.SpringBootJPAGetEntities.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
