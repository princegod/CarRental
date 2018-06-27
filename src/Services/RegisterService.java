package Services;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.CarRental.Model.UserModel.User;

import DAO.hibernateUtility;

public class RegisterService {
public boolean register(User user){
	Session session=hibernateUtility.openSession();
	Transaction tx=null;
	try{
		session.beginTransaction();
		
		
		session.save(user);
		tx=session.getTransaction();
		tx.commit();
	}catch(Exception e){
		if(tx !=null){
			tx.rollback();
		}
		e.printStackTrace();
	}
	finally{
		session.close();
	}
	return true;
	
	
}
}
