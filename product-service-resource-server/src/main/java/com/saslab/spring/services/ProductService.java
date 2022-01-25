package com.saslab.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saslab.spring.model.Product;
import com.saslab.spring.repository.ProductRepository;


@Service
public class ProductService {
	
	
	
	

	private  final ProductRepository productRepository;
	@Autowired
	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	
	public List<Product>getAllProducts(){
		
		return productRepository.findAll();
		
	}
	
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
		
	}
	
	public void deleteProduct (String id) {
		
		productRepository.deleteById(id);
	}
	
	public Product updateProduct (Product product , String id) {
		
		product.setId(id);
		return productRepository.insert(product);
	}

}
