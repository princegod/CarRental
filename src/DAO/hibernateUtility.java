package DAO;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class hibernateUtility {
	private static SessionFactory sessionFactory;
	
	static {
		try{
			sessionFactory=new Configuration().configure().buildSessionFactory();
		
		   }catch(Throwable ex){
			   System.err.println("Initial SessionFactory creation "+ex);

			   throw new ExceptionInInitializerError(ex);
				   }
		   }
	public static Session openSession(){
		return sessionFactory.openSession();
	}
	

}
