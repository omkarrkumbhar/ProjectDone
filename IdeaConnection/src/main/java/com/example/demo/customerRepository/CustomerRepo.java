package com.example.demo.customerRepository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.customer.CustomerIdea;

@Repository
public interface CustomerRepo extends CrudRepository<CustomerIdea, Serializable> {

	public CustomerIdea getById(Integer id);
}
