package com.StandaloneCollections;

import java.util.List;

public class ProductList {
	List<String> Pnames;

	public List<String> getPnames() {
		return Pnames;
	}

	public void setPnames(List<String> pnames) {
		Pnames = pnames;
	}

	@Override
	public String toString() {
		return "ProductList Pnames=" + Pnames ;
	}

	
	

}
