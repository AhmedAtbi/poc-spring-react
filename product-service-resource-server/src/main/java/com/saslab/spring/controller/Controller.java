package com.saslab.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.saslab.spring.model.Product;
import com.saslab.spring.services.ProductService;

import lombok.RequiredArgsConstructor;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    
    
    private final ProductService productService;
	

    @GetMapping("/product/all")
    @RolesAllowed({"product_read"})
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll() {
        return productService.getAllProducts();
    }

    @PostMapping("/product/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }
    @GetMapping("/product")
    @RolesAllowed({"product_read"})
    public String getProduct(Principal principal) {
        return "Response from Product Service, User Id:" + principal.getName();
    }
    
}

