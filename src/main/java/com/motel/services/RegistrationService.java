package com.motel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motel.components.entity.Customer;
import com.motel.components.interfaces.IRegistrationCustomer;

@Service
public class RegistrationService {

	@Autowired
	private IRegistrationCustomer iRegistrationCustomer;
	
	public String registrationCustomer(Customer customer){
		Boolean registered = iRegistrationCustomer.registrationCustomer(customer); 
		return registered ? "Registered" : "No registered";
	}
	
}
