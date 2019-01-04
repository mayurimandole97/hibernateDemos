package com.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity

public class EmployeeEntity implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int employeeId;
private String firstName;
private String lastName;

@OneToOne
private AccountEntity account;

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public AccountEntity getAccount() {
	return account;
}

public void setAccount(AccountEntity account) {
	this.account = account;
}

@Override
public String toString() {
	return "EmployeeEntity [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", account=" + account + "]";
}

public EmployeeEntity( String firstName, String lastName) {
	super();
	
	this.firstName = firstName;
	this.lastName = lastName;
	
}

public EmployeeEntity() {
	super();
}

}
