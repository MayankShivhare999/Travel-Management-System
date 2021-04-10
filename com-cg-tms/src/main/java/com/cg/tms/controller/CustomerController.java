package com.cg.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tms.entities.Customer;
import com.cg.tms.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addcustomer")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@GetMapping("/getcustomers")
	public List<Customer> getAllCustomers() {
		List<Customer> list = customerService.getAllCustomer();
		return list;
	}
	
	@GetMapping("/getcustomerbyid/{id}")
	public Customer getAllCustomers(@PathVariable int id) {
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}
}
