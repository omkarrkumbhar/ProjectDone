package com.example.demo.customerController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.CustomerIdea;
import com.example.demo.customerRepository.CustomerRepo;
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
	@GetMapping("/custId/{id}")
	public ResponseEntity<CustomerIdea> getId(@PathVariable("id") Integer id){
		CustomerIdea idea=customerService.getData(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(idea); 
		
	}
	@PutMapping("/updateCust/{id}")
	public ResponseEntity<CustomerIdea> getUpdate(@RequestBody CustomerIdea customerIdea,@PathVariable("id") Integer id){
		
		CustomerIdea idea=customerService.getData(id);
	
		if(customerIdea.getName()!=null) {
		idea.setName(customerIdea.getName());
		}else {
			idea.setName(idea.getName());
		}
		
		if(customerIdea.getLastName()!=null) {
			idea.setLastName(customerIdea.getLastName());
		}else {
			idea.setLastName(idea.getLastName());
		}
		
		if(customerIdea.getPinCode()!=null) {
			idea.setPinCode(customerIdea.getPinCode());
		}else {
			idea.setPinCode(idea.getPinCode());
		}
		
		CustomerIdea custUpdate=customerService.save(idea);
		return ResponseEntity.status(HttpStatus.FOUND).body(custUpdate);
		
	}
	
	
	
}
