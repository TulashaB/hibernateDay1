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
		
		//------------    
        session.getTransaction().commit();
        session.close();
        //-----------------------
	}
}
