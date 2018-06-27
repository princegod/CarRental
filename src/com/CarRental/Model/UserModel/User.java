package com.CarRental.Model.UserModel;

import java.util.*;

import javax.persistence.*;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_id")
	private Long Uid;
	private String Username;
	private String Password;
	public User(String username, String password,
			Collection<Address> listOfAddress, String dob, String gender) {
		super();
		Username = username;
		Password = password;
		ListOfAddress = listOfAddress;
		Dob = dob;
		Gender = gender;
	}
	@OneToMany	
	private Collection<Address> ListOfAddress=new ArrayList<>();
	private String Dob;
	private String Gender;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		ListOfAddress = listOfAddress;
	}
	public Collection<Address> getListOfAddress() {
		return ListOfAddress;
	}

	
	public Long getUid() {
		return Uid;
	}
	public void setUid(Long uid) {
		Uid = uid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	

}
