package com.ranuka.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ranuka.insurance.customer.model.Customer;

@Service
public interface CustomerService {

	/**
	 * Return list of all Customers 
	 * 
	 * @return a list of Customers
	 */
	List<Customer> getCustomers();

	/**
	 * Return Customer for the given id
	 * 
	 * @param id
	 * @return Customer
	 */
	Customer getCustomer(long id);

	/**
	 *  Saves a given Customer. Return the saved Customer
	 *
	 * @param the saved Customer
	 * @return
	 */
	Customer createCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	void deleteCustomer(long id);
	
	Customer getCustomerByEmail(String email);

	
}
