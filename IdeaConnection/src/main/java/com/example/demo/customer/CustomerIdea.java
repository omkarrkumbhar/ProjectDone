package com.example.demo.customer;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustIdea")
public class CustomerIdea {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String lastName;
private String pinCode;


public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
