package com.hibernate;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Employee implements Serializable{
private int empId;
private String name;
private String password;
private String email;
private Calendar empJoinDate;
private Date empLogin;
private boolean isPermanent;
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Emp_seq")
@SequenceGenerator(name="Emp_seq",sequenceName="OrclEmpSeq")
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Calendar getEmpJoinDate() {
	return empJoinDate;
}
@Temporal(TemporalType.DATE)
public void setEmpJoinDate(Calendar empJoinDate) {
	this.empJoinDate = empJoinDate;
}
//@Temporal(TemporalType.TIMESTAMP)
public Date getEmpLogin() {
	return empLogin;
}
public void setEmpLogin(Date empLogin) {
	this.empLogin = empLogin;
}
public boolean isPermanent() {
	return isPermanent;
}
public void setPermanent(boolean isPermanent) {
	this.isPermanent = isPermanent;
}

public Employee(int empId, String name, String password, String email, Calendar empJoinDate, Date empLogin,
		boolean isPermanent) {
	super();
	this.empId = empId;
	this.name = name;
	this.password = password;
	this.email = email;
	this.empJoinDate = empJoinDate;
	this.empLogin = empLogin;
	this.isPermanent = isPermanent;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", password=" + password + ", email=" + email
			+ ", empJoinDate=" + empJoinDate + ", empLogin=" + empLogin + ", isPermanent=" + isPermanent + "]";
}
public Employee() {
	super();
}
public void setPassword(String password) {
	this.password = password;
	
}

}
