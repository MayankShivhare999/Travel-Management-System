package com.cg.tms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tms.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findCustomerById(int id);
}
