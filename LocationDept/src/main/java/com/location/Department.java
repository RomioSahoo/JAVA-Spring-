package com.location;

public class Department {

	private int id;
	private String name;
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Department ID:"+id+" Department Name:"+name;
	}
	
}
