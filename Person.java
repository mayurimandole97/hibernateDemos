package firsthibernate.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person implements Serializable{
	@Id
	@GeneratedValue
	
private int personId;
private String name;
@OneToOne(cascade=CascadeType.ALL)

private PersonDetail pdetails;
public int getPersonId() {
	return personId;
}
public void setPersonId() {
	this.personId = personId;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Person(int person_Id, String name) {
	super();
	this.personId = person_Id;
	this.name = name;
	
}
public Person() {
	super();
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", name=" + name+"]";
}
public PersonDetail getPdetails() {
	return pdetails;
}
public void setPdetails(PersonDetail pdetails) {
	this.pdetails = pdetails;
}

}
