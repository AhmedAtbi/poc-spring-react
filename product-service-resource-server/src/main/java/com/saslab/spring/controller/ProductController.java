package com.saslab.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.saslab.spring.model.Product;

import com.saslab.spring.services.ProductService;


import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(value = "/api/product")
@RequiredArgsConstructor


public class ProductController {

		
		@Autowired
	    private final ProductService productService;
		

	    @GetMapping
	    @ResponseStatus(HttpStatus.OK)
	    public List<Product> findAll() {
	        return productService.getAllProducts();
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public void createProduct(@RequestBody Product product) {
	        productService.addProduct(product);
	    }
	    
	    

}
