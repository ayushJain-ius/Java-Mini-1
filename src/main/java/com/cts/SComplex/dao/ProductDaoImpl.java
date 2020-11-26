package com.cts.SComplex.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.cts.SComplex.model.Product;

@Service
public class ProductDaoImpl implements ProductDao {
	
JdbcTemplate template;  
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
	template = new JdbcTemplate(dataSource);
	}

	@Override
	public Product getProductDetailByItemId(int itemId) {
		
		System.out.println("inside getProductDetailByItemId of Product");
		return template.query("SELECT * FROM product WHERE itemId="+itemId,new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				Product cr = new Product();
				while(rs.next()){
					cr.setItemId(rs.getInt(1));
					cr.setItemName(rs.getString(2));
					cr.setSportName(rs.getString(3));
					cr.setBrand(rs.getString(4));
					cr.setPrice(rs.getInt(5));
					cr.setRating(rs.getString(6));
				}
				return cr;
			}
					
		});
		
	}

	@Override
	public int addProduct(String itemName, String sportName, String brand, int price, String rating) {
		
		System.out.println("inside addProduct");
		String sql="INSERT INTO product(itemName, sportName, brand, price, rating) VALUES(?,?,?,?,?)";
		System.out.println(sql);
        int a = template.update(sql, itemName, sportName, brand, price, rating); 
        if(a > 0 ) {
        	System.out.println("Added successfully");
        }else {
        	System.out.println("nothing Added");
        }
        
        return a;
	}

}
