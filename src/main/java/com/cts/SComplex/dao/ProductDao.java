package com.cts.SComplex.dao;


import com.cts.SComplex.model.Product;

public interface ProductDao {
	
	public Product getProductDetailByItemId(int itemId);
	public int addProduct( String itemName, String sportName, String brand, int price, String rating );

}