package com.motel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.motel.components.entity.Customer;
import com.motel.services.RegistrationService;

@RestController
@RequestMapping("/motel")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String registrationCustomer(@RequestBody Customer customer){
		return registrationService.registrationCustomer(customer);
	}
	
}
