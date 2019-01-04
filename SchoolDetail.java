package com.hibernate;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetail implements Serializable{
private int studcount;
private String address;
private String isSchoolActive;
public int getStudcount() {
	return studcount;
}
public void setStudcount(int studcount) {
	this.studcount = studcount;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String isSchoolActive() {
	return isSchoolActive;
}
public void setSchoolActive(String isSchoolActive) {
	this.isSchoolActive = isSchoolActive;
}
public SchoolDetail(int studcount, String address, String isSchoolActive) {
	super();
	this.studcount = studcount;
	this.address = address;
	this.isSchoolActive = isSchoolActive;
}
public SchoolDetail() {
	super();
}

@Override
public String toString() {
	return "SchoolDetail [studcount=" + studcount + ", address=" + address + ", isSchoolActive=" + isSchoolActive + "]";
}

}
