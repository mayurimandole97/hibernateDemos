package firsthibernate.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class PersonDetail implements Serializable {
	
	@Id
	@GeneratedValue
	
	private int pdId;
	private float salary;
	private String aadharnum;
	public int getPdId() {
		return pdId;
	}
	public void setPdId(int pdId) {
		this.pdId = pdId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAadharnum() {
		return aadharnum;
	}
	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}
	@Override
	public String toString() {
		return "PersonDetail [pdId=" + pdId + ", salary=" + salary + ", aadharnum=" + aadharnum + "]";
	}
	public PersonDetail(int pdId, float salary, String aadharnum) {
		super();
		this.pdId = pdId;
		this.salary = salary;
		this.aadharnum = aadharnum;
	}
	public PersonDetail() {
		super();
	}
	

}
