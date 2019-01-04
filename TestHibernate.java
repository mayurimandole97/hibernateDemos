package com.test.app;

import java.sql.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Employee;

public class TestHibernate {
public static void main(String[] args) {
	Employee e1=new Employee();
	LocalDate d1=LocalDate.of(2018, 1,1);
	Configuration config=new Configuration();
	SessionFactory sfactory =config.configure().buildSessionFactory();
	Session session=sfactory.openSession();
	Transaction tx=session.beginTransaction();
	e1.setEmail("mm@gmail.com");  //DB
	e1.setEmpJoinDate(new GregorianCalendar(2018, 10, 3));
	e1.setEmpLogin(Date.valueOf("2019-01-01"));
	e1.setName("meeta");
	e1.setPassword("mitali");
	e1.setPermanent(true);
	int empid=(int)session.save(e1);
	System.out.println("id of newly created password"+empid);
	tx.commit();
	session.close();//detached phase
	e1.setEmail("kk@hotmail.com");   //object
	e1.setEmail("dd@hotmail.com"); 
	Session session1=sfactory.getCurrentSession();
	Employee e2=(Employee) session1.load(Employee.class,empid);
	System.out.println("before changes" +e2);
	session1.saveOrUpdate(e1);//persistent
	System.out.println("after changes" +e2);
	Employee e3=(Employee) session1.load(Employee.class,empid);
	System.out.println(e3);
}
}
