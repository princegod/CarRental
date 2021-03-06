package com.CarRental.Model.UserModel;

import javax.persistence.Embeddable;
@Embeddable
public class Address {
	
	private String Email;
	private String Mobile;
    private String Street;
	private String city;
	private String State;
	private String country;
	private String pincode;


    
	public Address(String email, String mobile, String street, String city,
			String state, String country, String pincode) {
		super();
		Email = email;
		Mobile = mobile;
		Street = street;
		this.city = city;
		State = state;
		this.country = country;
		this.pincode = pincode;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
