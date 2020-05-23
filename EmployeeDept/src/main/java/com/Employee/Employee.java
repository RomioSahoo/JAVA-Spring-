package com.Employee;

public class Employee {
	
	private int id;
	private String name;
	private String gender;
	private String designation;
	private String email;
	private String salary;
	public Employee(int id, String name, String gender, String designation, String email, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
		this.email = email;
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Id:"+id+"\nGender:"+gender+"\nDesignation:"+designation+"\nemail:"+email+"\nSalary:"+salary+"\n";
	}
	
	

}
