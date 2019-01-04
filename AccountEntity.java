package com.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountEntity implements Serializable {
	
	
@Id
@Column(name="id",nullable=false,unique=true)
@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int accountId;

@Column(nullable=false,length=40)

	private String accountNo;
@OneToOne(mappedBy="account")
private EmployeeEntity employee;
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public EmployeeEntity getEmployee() {
	return employee;
}
public void setEmployee(EmployeeEntity employee) {
	this.employee = employee;
}
@Override
public String toString() {
	return "AccountEntity [accountId=" + accountId + ", accountNo=" + accountNo + ", employee=" + employee + "]";
}
public AccountEntity( String accountNo) {
	super();
	
	this.accountNo = accountNo;
	
}
public AccountEntity() {
	super();
}
	
	

}
