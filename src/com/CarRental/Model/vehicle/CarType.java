package com.CarRental.Model.vehicle;
import javax.persistence.*;
@Entity
public class CarType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long CarTypeId;
	private String  CartypeName;
	private String CarType_descr;
	public Long getCarTypeId() {
		return CarTypeId;
	}
	public void setCarTypeId(Long carTypeId) {
		CarTypeId = carTypeId;
	}
	public String getCartypeName() {
		return CartypeName;
	}
	public void setCartypeName(String cartypeName) {
		CartypeName = cartypeName;
	}
	public String getCarType_descr() {
		return CarType_descr;
	}
	public void setCarType_descr(String carType_descr) {
		CarType_descr = carType_descr;
	}
	
	

}
