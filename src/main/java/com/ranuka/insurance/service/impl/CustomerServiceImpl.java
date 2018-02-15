package com.ranuka.insurance.service.impl;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.ws.rs.NotFoundException;

import org.springframework.stereotype.Service;

import com.ranuka.insurance.customer.model.Customer;
import com.ranuka.insurance.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	List<Customer> customerList = new ArrayList<>(Arrays.asList(
			new Customer(1, "Ranuka", "De Silva",Date.from(LocalDate.of(1985, 10, 15).atStartOfDay(ZoneId.systemDefault()).toInstant())),
			new Customer(2, "Dilini", "Rajapaksha", Date.from(LocalDate.of(1984, 10, 10).atStartOfDay(ZoneId.systemDefault()).toInstant()))
			));

	@Override
	public List<Customer> getCustomers() {
		return customerList;
	}

	@Override
	public Customer getCustomer(long id) {
		
		return customerList.stream().filter(p -> p.getId()==id).findFirst().orElseThrow(NotFoundException::new);
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
