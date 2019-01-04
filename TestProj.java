package com.test.app;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inheritance.Module;
import com.inheritance.Project;
import com.inheritance.Task;

import firsthibernate.util.HibernateUtil;

public class TestProj {
public static void main(String[] args) {
	
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
	Project p1=new Project ();
	p1.setStartdate(Date.valueOf("2018-3-3"));
	p1.setTitle("banking");
	int id=(int)session.save(p1);
	
	Module m1=new Module();
	m1.setId(id);//... For joined
	m1.setModulename("withdrawl");
	session.save(m1);
	
	Task t1=new Task();
	t1.setModulename(m1.getModulename());//..For joined
	t1.setTaskname("exception hadlng");
	session.save(t1);
	
	Project p2=new Project ();
	p2.setStartdate(Date.valueOf("2019-3-3"));
	p2.setTitle("ecommerce");
	int idp2=(int)session.save(p2);
	
	Module m2=new Module();
	m2.setId(idp2);//... For joined
	m2.setModulename("cart");
	session.save(m2);
	
	Task t2=new Task();
	t2.setModulename(m2.getModulename());//..For joined
	t2.setTaskname("documentation");
	session.save(t2);
	
	
	tx.commit();
	String hql="from Project p";
	Query query=session.createQuery(hql);
	List<Project> plist=query.list();
	
	for(Project p:plist)
	{
		System.out.println(p);
	}
	session.close();
	
}
}
