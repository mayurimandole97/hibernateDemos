package com.test.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.model.AccountEntity;
import com.test.model.EmployeeEntity;

import firsthibernate.util.HibernateUtil;

public class TesterEmpAcc {
public static void main(String[] args) {
	SessionFactory factory=HibernateUtil.getSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	AccountEntity accEntity=new AccountEntity ("3434_3434");
	EmployeeEntity empEntity=new EmployeeEntity ("Heena","rai");
	empEntity.setAccount(accEntity);
	session.save(accEntity);
	session.save(empEntity);
	tx.commit();
	Query query=session.createQuery("from EmployeeEntity");
	List<EmployeeEntity>emplist=query.list();
	for(EmployeeEntity e:emplist)
	{
		System.out.println(e);
	}
}
}
