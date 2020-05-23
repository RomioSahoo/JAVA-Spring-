package com.location;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private Date doj;
	private int salary;
	public Employee(int id, String name, Date doj, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id:"+id+"  Employee Name:"+name+"  date of joining:"+doj+"  Salary:"+salary;
	}
	
	

}
