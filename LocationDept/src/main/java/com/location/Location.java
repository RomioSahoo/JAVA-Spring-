package com.location;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Location {

	private String city;
	private String locId;
	private Map<Department,Employee>details;
	
	
	public Location(String city, String locId, Map<Department, Employee> details) {
		super();
		this.city = city;
		this.locId = locId;
		this.details = details;
	}
	


	public void display() {
		System.out.println("City:"+city);
		System.out.println("Location ID"+locId);
		System.out.println("Details:");
		Set<Entry<Department, Employee>>set=details.entrySet();
		Iterator<Entry<Department,Employee>>itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Department,Employee> entry=itr.next();
			Department dt=entry.getKey();
			Employee e=entry.getValue();
			System.out.println("Department details:");
			System.out.println(dt);
			System.out.println("Employee details");
			System.out.println(e);
		}
		
	}
}
