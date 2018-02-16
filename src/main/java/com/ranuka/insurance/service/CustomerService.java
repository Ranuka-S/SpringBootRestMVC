package com.ranuka.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ranuka.insurance.customer.model.Customer;

@Service
public interface CustomerService {

	List<Customer> getCustomers();

	Customer getCustomer(long id);

	Customer createCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(long id);

	
}
