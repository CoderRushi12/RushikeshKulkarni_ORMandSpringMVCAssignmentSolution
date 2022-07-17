package com.customerRelationship.service;

import java.util.List;

import com.customerRelationship.entity.Customer;

public interface CustomerManagementService {

	public List<Customer> listCustomers();

	public Customer getCustomerById(long customerId);

	public void addCustomer(Customer theCustomer);

	public void updateCustomer(Customer theCustomer);

	public void removeCustomerById(long customerId);
}
