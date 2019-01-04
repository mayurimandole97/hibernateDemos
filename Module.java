package com.inheritance;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Module extends Project{
private String modulename;


public String getModulename() {
	return modulename;
}

public void setModulename(String modulename) {
	this.modulename = modulename;
}

public Module(int id, String title, Date startdate, String modulename) {
	super(id, title, startdate);
	this.modulename = modulename;
}

public Module(int id, String title, Date startdate) {
	super(id, title, startdate);
}

@Override
public String toString() {
	return "Module [modulename=" + modulename + "]";
}

public Module() {
	super();
}



}
