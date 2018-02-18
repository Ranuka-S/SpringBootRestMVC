package com.ranuka.insurance.controller.impl;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranuka.insurance.controller.CustomerController;
import com.ranuka.insurance.customer.model.Customer;
import com.ranuka.insurance.service.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController{

	@Autowired
	CustomerService customerService;
	
	@Override
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	
	}

	@Override
	public Customer getCustomer(@PathVariable Long id) {
		return customerService.getCustomer(id);
	}

	@Override
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	@Override
	public Customer updateCustomer( @RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

	@Override
	public void deleteCuctomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}

	@Override
	public Customer getCustomerByEmail(@QueryParam("email") String email) {
		
		return customerService.getCustomerByEmail(email);
	}

}
