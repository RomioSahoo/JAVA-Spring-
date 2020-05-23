package com.properties;

public class Mydao {

	private String dbServer;
	
	public Mydao(String dbServer) {
		
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "Mydao dbServer=" + dbServer ;
	}
	
}
