package com.test.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Airline;
import com.hibernate.Flight;

import firsthibernate.util.HibernateUtil;

public class TestAirline {
public static void main(String[] args) {
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Airline airline1=new Airline();
	Airline airline2=new Airline();
	airline1.setName("Vistara");
	airline2.setName("AirIndia");
	session.save(airline1);
	session.save(airline2);
	tx.commit();
	System.out.println("Data saved");
	session.close();
}
}
