package com.inheritance;



import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Task extends Module {
private String taskname;

public String getTaskname() {
	return taskname;
}

public void setTaskname(String taskname) {
	this.taskname = taskname;
}

public Task(int id, String title, Date startdate, String modulename, String taskname) {
	super(id, title, startdate, modulename);
	this.taskname = taskname;
}

public Task(int id, String title, Date startdate, String modulename) {
	super(id, title, startdate, modulename);
}

@Override
public String toString() {
	return "Task [taskname=" + taskname + "]";
}

public Task() {
	super();
}

}
