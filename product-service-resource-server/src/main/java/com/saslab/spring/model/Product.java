package com.saslab.spring.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Document(value="product")
@AllArgsConstructor


@Builder
@Data
public class Product {

	public Product() {
		
	}
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}
