package com.example.demo.customerRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.customer.CustomerIdea;

@Repository
public interface CustomerRepo extends CrudRepository<CustomerIdea, Integer> {

	public CustomerIdea getById(Integer id);
}
