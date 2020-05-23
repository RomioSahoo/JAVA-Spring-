package com.instructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ins")
@Scope("prototype")
public class Instructor {
	@Value("101")
	private int id;
	@Value("Romio")
	private String name;
	@Value("#{grade}")
	private List<String> list;
	@Autowired
	private Profile profile;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", list=" + list + ", profile=" + profile + "]";
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	

}
