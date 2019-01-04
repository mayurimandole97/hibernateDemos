package com.inheritance;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)//single_table,table_per_class
public class Project {
private int id;
private String title;
private Date startdate;

@Id
@GeneratedValue(generator="prj_seq",strategy=GenerationType.SEQUENCE)
@SequenceGenerator(name="prj_seq",sequenceName="prj_seq")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Date getStartdate() {
	return startdate;
}
public void setStartdate(Date startdate) {
	this.startdate = startdate;
}
public Project(int id, String title, Date startdate) {
	super();
	this.id = id;
	this.title = title;
	this.startdate = startdate;
}
public Project() {
	super();
}
@Override
public String toString() {
	return "Project [id=" + id + ", title=" + title + ", startdate=" + startdate + "]";
}

}
