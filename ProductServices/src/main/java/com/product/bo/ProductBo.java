package com.product.bo;

import com.product.dto.Product;

public interface ProductBo {

	public void create(Product product);
	public Product findProduct(int id);
}
