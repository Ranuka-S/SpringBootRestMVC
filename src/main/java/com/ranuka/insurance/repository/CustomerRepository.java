package com.ranuka.insurance.repository;

import org.springframework.data.repository.CrudRepository;

import com.ranuka.insurance.customer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	Customer findByEmail(String email);

}
