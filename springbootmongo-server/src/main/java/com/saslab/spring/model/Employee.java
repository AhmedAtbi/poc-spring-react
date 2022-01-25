package com.saslab.spring.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
	

	@Id
	@Field("_id")
	private String id;
	private String firstName;	
	private String lastName;
	private String emailId;
	
	
	
}
