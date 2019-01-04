package com.test.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.School;
import com.hibernate.SchoolDetail;

import firsthibernate.util.HibernateUtil;

public class TestSchool {
public static void main(String[] args) {
	School school =new School("poddar");
			SchoolDetail schooldetail=new SchoolDetail();
			schooldetail.setAddress("santracruz");
			schooldetail.setStudcount(10000);
			schooldetail.setSchoolActive("false");
			
			school.setSchooldetail(schooldetail);
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			session.save(school);
			System.out.println("saving school object");
			tx.commit();
			session.close();
}
}
