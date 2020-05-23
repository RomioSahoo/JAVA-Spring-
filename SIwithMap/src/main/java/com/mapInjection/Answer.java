package com.mapInjection;

import java.util.Date;

public class Answer {

	private int id;
	private String answers;
	private Date posteddate;
	public Answer() {}
	public Answer(int id, String answers, Date posteddate) {
		super();
		this.id = id;
		this.answers = answers;
		this.posteddate = posteddate;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id:"+id+"\tAnswer:"+answers+"\tPosted Date:"+posteddate;
	}
	
}
