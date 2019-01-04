package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import firsthibernate.model.Person;
import firsthibernate.model.PersonDetail;
import firsthibernate.util.HibernateUtil;

public class addPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private SessionFactory sf=HibernateUtil.getSessionFactory();
       private Session session;
   
    public addPerson() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person p2=new Person();
		p2.setName(request.getParameter("name"));
		
		PersonDetail pd2=new PersonDetail();
		pd2.setAadharnum(request.getParameter("aadharnum"));
		pd2.setSalary(Float.parseFloat(request.getParameter("salary")));
		p2.setPdetails(pd2);
		//till this time p2 is transient not attaches to any persistence mechanism
		session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		//In persistent state 
		session.save(p2);
		tx.commit();
		session.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
