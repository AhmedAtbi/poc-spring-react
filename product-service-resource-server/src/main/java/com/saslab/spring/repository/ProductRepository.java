package com.saslab.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saslab.spring.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
	

}
