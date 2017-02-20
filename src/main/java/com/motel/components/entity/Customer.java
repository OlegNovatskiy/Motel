package com.motel.components.entity;

import java.sql.Date;

public class Customer {

	private Long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date birthDate;
	private String numberPasport;
	private String country;
	private String region;
	private String city;
	private String district;
	private String street;
	private String numberHome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getNumberPasport() {
		return numberPasport;
	}

	public void setNumberPasport(String numberPasport) {
		this.numberPasport = numberPasport;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumberHome() {
		return numberHome;
	}

	public void setNumberHome(String numberHome) {
		this.numberHome = numberHome;
	}

}
