package com.hibernate;

public class Airline {
private int airlineid;
private String name;
public int getAirlineid() {
	return airlineid;
}
public void setAirlineid(int airlineid) {
	this.airlineid = airlineid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Airline( String name) {
	super();
	
	this.name = name;
}
public Airline() {
	super();
}
@Override
public String toString() {
	return "Airline [airlineid=" + airlineid + ", name=" + name + "]";
}

}
