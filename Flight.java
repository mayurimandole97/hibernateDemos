package com.hibernate;

import java.util.List;

public class Flight {
private int flightid;
private String fromSector;
private String toSector;
private int capacity;
private List<Airline> airlineList;

public List<Airline> getAirlineList() {
	return airlineList;
}
public void setAirlineList(List<Airline> airlineList) {
	this.airlineList = airlineList;
}
public int getflightid() {
	return flightid;
}
public void setflightid(int flightid) {
	this.flightid = flightid;
}
public String getFromSector() {
	return fromSector;
}
public void setFromSector(String fromSector) {
	this.fromSector = fromSector;
}
public String getToSector() {
	return toSector;
}
public void setToSector(String toSector) {
	this.toSector = toSector;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public Flight( String fromSector, String toSector, int capacity) {
	super();
	
	this.fromSector = fromSector;
	this.toSector = toSector;
	this.capacity = capacity;
}
public Flight() {
	super();
}
@Override
public String toString() {
	return "Flight [flightid=" + flightid + ", fromSector=" + fromSector + ", toSector=" + toSector + ", capacity=" + capacity
			+ "]" + this.getAirlineList() ;
}

}
