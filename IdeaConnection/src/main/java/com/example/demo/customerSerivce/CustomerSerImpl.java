package com.example.demo.customerSerivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.CustomerIdea;
import com.example.demo.customerRepository.CustomerRepo;

@Service
public class CustomerSerImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	@Override
	public CustomerIdea save(CustomerIdea customerIdea) {
		
		return customerRepo.save(customerIdea);
	}

	@Override
	public CustomerIdea getdta(Integer id) {
		
		return customerRepo.getById(id);
	}

}
