package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity      //Employee java class will become a table in batch5db
public class Employee {
	
	
	private int empId;     //primary key (@Id)
	private String name;
	private int salary;
	public Employee() {
		super();
		
	}
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Id      // this attribute will become a primary key in employee table
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
