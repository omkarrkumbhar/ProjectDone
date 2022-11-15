package com.example.demo.customerRepository;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.customer.CustomerIdea;

@Repository
public interface CustomerRepo extends CrudRepository<CustomerIdea, Serializable> {

	
	
	public CustomerIdea getById(Integer id);
	
	
}
