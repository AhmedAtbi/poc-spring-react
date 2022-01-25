package com.saslab.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.saslab.spring.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
