package com.hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class School implements Serializable{
private int schoolid;
private String schoolName;
private SchoolDetail schooldetail;
@Id
@GeneratedValue(generator="schseq",strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="schseq",sequenceName="schseq")
public int getSchoolid() {
	return schoolid;
}
public void setSchoolid(int schoolid) {
	this.schoolid = schoolid;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}

public SchoolDetail getSchooldetail() {
	return schooldetail;
}
public void setSchooldetail(SchoolDetail schooldetail) {
	this.schooldetail = schooldetail;
}
public School( String schoolName) {
	super();

	this.schoolName = schoolName;
}
public School() {
	super();
}
@Override
public String toString() {
	return "School [schoolid=" + schoolid + ", schoolName=" + schoolName + "]";
}

}
