package com.mapInjection;

public class User {
	private int id;
	private String name;
	private String email;
	public User() {}
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+id+"\tName"+name+"\tEmail Id:"+email;
	}
	
	
}
