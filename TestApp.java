package com.test.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Customer;

import firsthibernate.util.HibernateUtil;

public class TestApp {
public static void main(String[] args) {
	int var;
	/*AnnotationConfiguration config=new AnnotationConfiguration();
	config.configure().buildSessionFactory();
	config.addAnnotatedClass(Customer.class);*/
	Customer c1=new Customer("Mira","NY",200,30);
	Customer c2=new Customer("Mayank","ME",280,10);
	Customer c3=new Customer("abc","NY",20,30);
	Customer c4=new Customer("def","ME",289,10);
	Customer c5=new Customer("ght","NY",29,30);
	Customer c6=new Customer("xyz","ME",222,10);
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	int retval=(int)session.save(c1);// to get id
	session.save(c2);
	session.save(c3);
	session.save(c4);
	session.save(c5);
	session.save(c6);
	System.out.println("cust data saved");
	tx.commit();
	
	var=c3.getCustid();
	System.out.println(var);
	Customer cust=(Customer)session.load(Customer.class, retval);
	System.out.println("first session");
	System.out.println(retval);
	System.out.println(cust);
	System.out.println("closing session");
	session.close();
	
	Session session2=factory.openSession();
	Transaction tx1=session2.beginTransaction();
Customer cust1=(Customer)session2.load(Customer.class,var);

	cust1.setAddress("dfgt");
	cust1.setCreditScore(100);
	cust1.setRewardPoints(10000);
	session2.saveOrUpdate(cust1);
	
	Query query=session2.createQuery("from Customer");
	
	List<Customer> custlist=query.list();
	System.out.println("2nd session");
	System.out.println("updated list of customers");
	for(Customer customer:custlist)
	{
		System.out.println(customer);
	}
	Criteria custcriteria=session2.createCriteria(Customer.class);
	
	custcriteria.add(Restrictions.gt("creditScore",200));
	custlist=custcriteria.list();
	System.out.println("customers having score>200");
	
	for(Customer c10:custlist)
	{
		System.out.println(c10);
		
	}
	session2.close();
	
	tx1.commit();
	}

}
