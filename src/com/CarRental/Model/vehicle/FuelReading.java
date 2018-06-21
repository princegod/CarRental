package com.CarRental.Model.vehicle;
import java.util.*;

import javax.persistence.*;
@Entity
public class FuelReading {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long FuelReadingType_id;
	private String FualType;
	@Temporal(TemporalType.DATE)
	private Date Rdate;
	@Temporal(TemporalType.TIME)
	private Date Rtime;
	private String Reading;
	private String version;
	public String getFualType() {
		return FualType;
	}
	public void setFualType(String fualType) {
		FualType = fualType;
	}
	public Date getRdate() {
		return Rdate;
	}
	public void setRdate(Date rdate) {
		Rdate = rdate;
	}
	public Date getRtime() {
		return Rtime;
	}
	public void setRtime(Date rtime) {
		Rtime = rtime;
	}
	public String getReading() {
		return Reading;
	}
	public void setReading(String reading) {
		Reading = reading;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	

}
