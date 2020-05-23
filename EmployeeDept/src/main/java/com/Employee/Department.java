package com.Employee;

import java.util.Iterator;
import java.util.List;

public class Department {
	private int id;
	private String name;
	private String location;
	private List<Employee>employees;
	
	public Department(int id, String name, String location, List<Employee> employees) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.employees = employees;
	}

	public void display()
	{
		System.out.println("Department id:"+id);
		System.out.println("Department name:"+name);
		System.out.println("Location:"+location);
		System.out.println();
		Iterator<Employee> itr=employees.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
