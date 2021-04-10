package com.cg.tms.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String description;
	int rating;
	LocalDate submitDate;
	
	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	Customer customer;
	
	// no-arg constructor
	public Feedback() {
		
	}

	// parameterized constructor
	public Feedback(String description, int rating, LocalDate submitDate, Customer customer) {
		this.description = description;
		this.rating = rating;
		this.submitDate = submitDate;
		this.customer = customer;
	}

	//getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public LocalDate getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", description=" + description + ", rating=" + rating + ", submitDate="
				+ submitDate + ", customer=" + customer + "]";
	}
}
