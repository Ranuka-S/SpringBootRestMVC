package com.ranuka.insurance.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranuka.insurance.customer.model.Customer;
import com.ranuka.insurance.repository.CustomerRepository;
import com.ranuka.insurance.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers =  new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		//customers.add(new Customer(1l, "Ranuka", "De Silva",Date.from(LocalDate.of(1985, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant())));
		return customers;
	}

	@Override
	public Customer getCustomer(long id) {
		return customerRepository.findOne(id);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(long id) {
		customerRepository.delete(id);
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		return customerRepository.findByEmail(email);
	}
	
}
