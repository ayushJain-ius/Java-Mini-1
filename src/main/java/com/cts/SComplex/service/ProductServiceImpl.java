package com.cts.SComplex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.SComplex.dao.ProductDaoImpl;
import com.cts.SComplex.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDaoImpl isd;
	
	@Override
	public Product getProductDetailByItemIds(int itemId) {
		System.out.println("inside getProductDetailByItemIds of Product");
		return isd.getProductDetailByItemId(itemId);
	}

	@Override
	public int addProducts( String itemName, String sportName, String brand, int price, String rating) {
		System.out.println("inside addProducts of Product");
		return isd.addProduct(itemName, sportName, brand, price, rating);
	}

}
