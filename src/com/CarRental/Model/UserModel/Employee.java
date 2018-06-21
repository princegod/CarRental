package com.CarRental.Model.UserModel;
import java.util.Date;

import DTO.Branch;

public class Employee extends User{
	private Long Eid;
	private Date joingDate;
	private Branch branch;
	public Date getJoingDate() {
		return joingDate;
	}
	public void setJoingDate(Date joingDate) {
		this.joingDate = joingDate;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	private String Role;
	
	

}
