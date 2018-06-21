package com.CarRental.Model.vehicle;
import javax.persistence.*;

import java.util.Date;
import java.util.Timer;
@Entity
public class SpeedoMeterReading {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Speedometer_id;
	
	@Temporal(TemporalType.DATE)
	private Date Run_date;
	@Temporal(TemporalType.TIME)
	private Date Run_time;
	private String  Reading;
	private String Version;
	public Long getSpeedometer_id() {
		return Speedometer_id;
	}
	public void setSpeedometer_id(Long speedometer_id) {
		Speedometer_id = speedometer_id;
	}
	
	public Date getRun_date() {
		return Run_date;
	}
	public void setRun_date(Date run_date) {
		Run_date = run_date;
	}
	public Date getRun_time() {
		return Run_time;
	}
	public void setRun_time(Date run_time) {
		Run_time = run_time;
	}
	public String getReading() {
		return Reading;
	}
	public void setReading(String reading) {
		Reading = reading;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	 
	
	

}
