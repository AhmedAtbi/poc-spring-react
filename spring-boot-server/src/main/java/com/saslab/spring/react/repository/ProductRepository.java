package com.saslab.spring.react.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saslab.spring.react.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByPublished(boolean published);
	List<Product> findByTitleContaining(String title);
}
