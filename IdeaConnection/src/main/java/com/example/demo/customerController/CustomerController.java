package com.example.demo.customerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.CustomerIdea;
import com.example.demo.customerSerivce.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/dataSave")
	public ResponseEntity<CustomerIdea>  dataSave(@RequestBody CustomerIdea customerIdea){
		CustomerIdea idea=customerService.save(customerIdea);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(idea);
		
	}
}
