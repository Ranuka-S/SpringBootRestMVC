package com.ranuka.insurance.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranuka.insurance.controller.CustomerController;
import com.ranuka.insurance.customer.model.Customer;
import com.ranuka.insurance.service.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController{

	@Autowired
	//@Qualifier("")
	CustomerService customerService;
	
	@Override
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	
	}

	@Override
	public Customer getCustomer(@PathVariable long id) {
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
	public Customer deleteCuctomer(long id) {
		return customerService.deleteCustomer(id);
	}

}
