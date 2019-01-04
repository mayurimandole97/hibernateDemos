package com.test.app;


import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.hibernate.Airline;
import com.hibernate.Flight;

import firsthibernate.util.HibernateUtil;

public class TestFlight {

public static void main(String[] args) {
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Flight flight1=new Flight();
	flight1.setCapacity(400);
	flight1.setFromSector("Mumbai");
	flight1.setToSector("Delhi");
	
	
	Airline airline1=new Airline("vistara");
	Airline airline2=new Airline("indigo");
	ArrayList<Airline>airlinelist=new ArrayList<>();
	airlinelist.add(airline1);
	airlinelist.add(airline2);
	flight1.setAirlineList(airlinelist);
	session.save(flight1);
	tx.commit();
	System.out.println("Data saved");
	session.close();
	
}
}
