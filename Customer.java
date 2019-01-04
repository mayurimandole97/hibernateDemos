package com.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
@SecondaryTable(name="custdetails")
public class Customer implements Serializable{
private int custid;
private String name;

@Column(name="custaddress" ,table="custdetails")
private String address;

@Column(name="score" ,table="custdetails")
private int creditScore;

@Column(name="reward", table="custdetails")
private int rewardPoints;
@Id
@GeneratedValue(generator="cust_seq",strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="cust_seq",sequenceName="cust_seq")
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="custaddress" ,table="custdetails")
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Column(name="score" ,table="custdetails")
public int getCreditScore() {
	return creditScore;
}
public void setCreditScore(int creditScore) {
	this.creditScore = creditScore;
}
@Column(name="reward" ,table="custdetails")
public int getRewardPoints() {
	return rewardPoints;
}
public void setRewardPoints(int rewardPoints) {
	this.rewardPoints = rewardPoints;
}
public Customer(String name, String address, int creditScore, int rewardPoints) {
	super();

	this.name = name;
	this.address = address;
	this.creditScore = creditScore;
	this.rewardPoints = rewardPoints;
}
public Customer() {
	super();
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + ", creditScore=" + creditScore
			+ ", rewardPoints=" + rewardPoints + "]";
}

}
