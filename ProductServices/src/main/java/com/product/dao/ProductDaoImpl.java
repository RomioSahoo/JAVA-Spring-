package com.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.product.dto.Product;

public class ProductDaoImpl implements ProductDao {

	Map<Integer,Product> products=new HashMap<Integer,Product>();
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		products.replace(product.getId(), product);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		products.remove(id);

	}

}
