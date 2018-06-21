package com.CarRental.Model.vehicle;
import java.util.*;
import javax.persistence.*; 
@Entity
@Table(name="Car_Details")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long CarId;
	private String CarName;
	private String CarRegNo;
	private Date DateOfAdding;
	private String CarModelYear;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private CarType cartype;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private fualType fualtype;
	
	@OneToMany
	private Collection<FuelReading> fualReadings=new ArrayList<>();
	
	@OneToMany
	Collection<SpeedoMeterReading> Speeddometer=new ArrayList<>();
	
	public CarType getCartype() {
		return cartype;
	}
	
	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarRegNo() {
		return CarRegNo;
	}
	public void setCarRegNo(String carRegNo) {
		CarRegNo = carRegNo;
	}
	public Date getDateOfAdding() {
		return DateOfAdding;
	}
	public void setDateOfAdding(Date dateOfAdding) {
		DateOfAdding = dateOfAdding;
	}
	public String getCarModelYear() {
		return CarModelYear;
	}
	public void setCarModelYear(String carModelYear) {
		CarModelYear = carModelYear;
	}
	
	public Collection<FuelReading> getFualReadings() {
		return fualReadings;
	}
	public void setFualReadings(Collection<FuelReading> fualReadings) {
		this.fualReadings = fualReadings;
	}
	public Collection<SpeedoMeterReading> getSpeeddometer() {
		return Speeddometer;
	}
	public void setSpeeddometer(Collection<SpeedoMeterReading> carType) {
		this.Speeddometer = carType;
	}
	public fualType getFualtype() {
		return fualtype;
	}
	public void setFualtype(fualType fualtype) {
		this.fualtype = fualtype;
	}
	

}
