package com.customerRelationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerRelationship.dao.CustomerManagementRepository;
import com.customerRelationship.entity.Customer;

@Service
@Transactional
public class CustomerManagementServiceImpl implements CustomerManagementService {

	@Autowired
	CustomerManagementRepository crmRepository;

	public CustomerManagementServiceImpl(CustomerManagementRepository crmRepository) {
		this.crmRepository = crmRepository;
	}

	@Override
	public List<Customer> listCustomers() {
		return crmRepository.listCustomers();
	}

	@Override
	public Customer getCustomerById(long customerId) {
		return crmRepository.getCustomerById(customerId);
	}

	@Override
	public void addCustomer(Customer theCustomer) {
		crmRepository.addCustomer(theCustomer);
	}

	@Override
	public void updateCustomer(Customer theCustomer) {
		crmRepository.updateCustomer(theCustomer);
	}

	@Override
	public void removeCustomerById(long customerId) {
		crmRepository.removeCustomerById(customerId);
	}
}
