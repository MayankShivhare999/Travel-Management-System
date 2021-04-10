package com.cg.tms.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.tms.entities.Customer;
import com.cg.tms.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	/**
	 * 
	 * @param customer of Customer type
	 */
	public void addCustomer(Customer customer) {
		 customerRepository.save(customer);
	}
	
	/**
	 * 
	 * @return List of all Customers
	 */
	public List<Customer> getAllCustomer() {
		List<Customer> list = customerRepository.findAll();
		return list;
	}
	
	/**
	 * 
	 * @param id of int type
	 * @return Customer whose id matches
	 */
	public Customer getCustomerById(int id) {
		Customer customer = customerRepository.findCustomerById(id);
		return customer;
	}
	
}
