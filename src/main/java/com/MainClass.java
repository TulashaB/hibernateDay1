package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        //--------------------------
		
      
		Employee emp=new Employee(1,"Tulasha",5555);
		session.save(emp);
		
		Employee emp2=new Employee(2,"Tila",1234);
		session.save(emp2);
		
		Employee emp4=new Employee(12,"Gopal",2222);
		session.save(emp4);
		
		Employee emp5=new Employee(11,"Sarita",8888);
		session.save(emp5);
		
		//------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------
	}
}
