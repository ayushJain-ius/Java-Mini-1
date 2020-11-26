package com.cts.SComplex.service;

import com.cts.SComplex.model.Product;

public interface ProductService {

	public Product getProductDetailByItemIds(int itemId);
	public int addProducts( String itemName, String sportName, String brand, int price, String rating);
	
}
