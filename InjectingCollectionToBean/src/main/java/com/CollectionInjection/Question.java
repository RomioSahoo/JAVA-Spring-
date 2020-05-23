package com.CollectionInjection;

import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> answers;

	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void display() {
		System.out.println("Question:"+id);
		System.out.println(name);
		System.out.println("Answers:");
		//printing the answers from the list
		for(String ans:answers) {
			System.out.println(ans);
		}
			
	}

}
