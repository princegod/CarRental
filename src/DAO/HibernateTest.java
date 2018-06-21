package DAO;

import java.util.Date;
import java.util.Timer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.CarRental.Model.UserModel.Address;
import com.CarRental.Model.UserModel.User;
import com.CarRental.Model.vehicle.Car;
import com.CarRental.Model.vehicle.CarType;
import com.CarRental.Model.vehicle.FuelReading;
import com.CarRental.Model.vehicle.SpeedoMeterReading;
import com.CarRental.Model.vehicle.fualType;

public class HibernateTest {

	public static void main(String[] args) {
//		User us1=new User();
//		us1.setDob(new Date());
//		us1.setGender("male");
//		us1.setPassword("dfghjk");
//		
//		
//		Address ad1=new Address();
//		ad1.setCity("qwer");
//		ad1.setCountry("fghj");
//		ad1.setEmail("sdfghjk");
//		ad1.setMobile("2345678");
//		ad1.setPincode("234567");
//		ad1.setStreet("sdfghj");
//		ad1.setState("swdrfghj");
//		Address ad2=new Address();
//		ad1.setCity("qwer");
//		ad1.setCountry("fghj");
//		ad1.setEmail("sdfghjk");
//		ad1.setMobile("2345678");
//		ad1.setPincode("234567");
//		ad1.setStreet("sdfghj");
//		ad1.setState("swdrfghj");
	
		Car car=new Car();
		
		car.setCarModelYear("244567");
		car.setCarName("qwerty");
		car.setCarRegNo("1234567");
		
		
		SpeedoMeterReading speed=new SpeedoMeterReading();
		
		speed.setReading("3456");
		speed.setRun_date(new Date());
		speed.setRun_time(new Date());
		speed.setSpeedometer_id(45678l);
		speed.setVersion("4567");
	    car.getSpeeddometer().add(speed);
		
	    
	    FuelReading fuel=new FuelReading();
	    fuel.setFualType("ertyu");
	    fuel.setRdate(new Date());
	    fuel.setReading("efrghjk");
	    fuel.setRtime(new Date());
	    fuel.setVersion("dfghj");
	    car.getFualReadings().add(fuel);
	    
	    
	    CarType type=new CarType();
	    type.setCarType_descr("qwertyuio");
	    type.setCartypeName("edrtgyu");
	    
	    
	    fualType fual=new fualType();
	    fual.setFualType_descr("erty");
	    fual.setFualType_Name("werf");
	    
	   
	    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	    Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(car);
		session.save(speed);
		session.save(fuel);
		session.save(fual);
		 session.save(type);
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
