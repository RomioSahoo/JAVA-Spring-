package com.product.bo;

import com.product.dao.ProductDao;
import com.product.dto.Product;

public class ProductBoImpl implements ProductBo {

	private ProductDao dao;
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	public ProductDao getDao() {
		return dao;
	}

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	
	

}
