package com.ranuka.insurance.controller;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ranuka.insurance.customer.model.Customer;

@RequestMapping("/customers")
public interface CustomerController {
	
	/**
	 * Return list of all Customers 
	 * 
	 * @return a list of Customers
	 */
	@GetMapping
	public List<Customer> getCustomers();
	
	/**
	 * Return Customer for the given id
	 * 
	 * @param id
	 * @return Customer
	 */
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Long id);
	
	/**
	 *  Saves a given Customer. Return the saved Customer
	 *
	 * @param the saved Customer
	 * @return
	 */
	@PostMapping
	public Customer createCustomer(Customer customer);
	
	/**
	 * Update the given Customer. Return the Updated Customer
	 * 
	 * @param customer to be updated
	 * @return the Updated entity
	 */
	@PutMapping
	public Customer updateCustomer(Customer customer);
	
	/**
	 * Deletes the entity with the given id.
	 * 
	 * @param id must not be null.
	 * @throws IllegalArgumentException in case the given {@code id} is null
	 */
	@DeleteMapping("/{id}")
	public void deleteCuctomer(@PathVariable Long id);
	
	@GetMapping(params = "email")
	public Customer getCustomerByEmail(@QueryParam("email") String email);
}
