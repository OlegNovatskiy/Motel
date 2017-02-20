package com.motel.components.services;

import org.springframework.stereotype.Repository;

import com.motel.components.entity.Customer;
import com.motel.components.interfaces.IRegistrationCustomer;

@Repository
public class RegistrationCustomerDAO implements IRegistrationCustomer{

	@Override
	public Boolean registrationCustomer(Customer customer) {

		return true;
	}

}
