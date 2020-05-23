package com.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.product.dto.Product;

public class ProductDaoImplTest {

	@Test
	public void create	() {
	ProductDao dao=new ProductDaoImpl();
	Product product=new Product();
	product.setId(1);
	product.setName("Lays");
	product.setDescription("Chips");
	product.setPrice(10);
	dao.create(product);
	
	product.setId(2);
	product.setName("Kurkure");
	product.setDescription("Chips");
	product.setPrice(10);
	dao.update(product);
	
	//dao.delete(1);
	Product result=dao.read(1);
	assertNotNull(result);
	assertEquals("Kurkure",result.getName());
	}

}
