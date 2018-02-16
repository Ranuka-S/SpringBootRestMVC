package com.ranuka.insurance.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranuka.insurance.customer.model.Customer;
import com.ranuka.insurance.service.CustomerService;

@RequestMapping("/customers")
public interface CustomerController {
	
	@GetMapping
	public List<Customer> getCustomers();
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Long id);
	
	@PostMapping
	public Customer createCustomer(Customer customer);
	
	@PutMapping
	public Customer updateCustomer(Customer customer);
	
	@DeleteMapping("/{id}")
	public void deleteCuctomer(Long id);
}
