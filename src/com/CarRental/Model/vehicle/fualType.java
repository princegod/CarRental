package com.CarRental.Model.vehicle;
import javax.persistence.*;

@Entity
public class fualType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long FualType_id;
	private String FualType_Name;
	private String FualType_descr;
	public Long getFualType_id() {
		return FualType_id;
	}
	public void setFualType_id(Long fualType_id) {
		FualType_id = fualType_id;
	}
	public String getFualType_Name() {
		return FualType_Name;
	}
	public void setFualType_Name(String fualType_Name) {
		FualType_Name = fualType_Name;
	}
	public String getFualType_descr() {
		return FualType_descr;
	}
	public void setFualType_descr(String fualType_descr) {
		FualType_descr = fualType_descr;
	}

	
}
