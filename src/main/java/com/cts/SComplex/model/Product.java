package com.cts.SComplex.model;

public class Product {
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	private int itemId, price;
	private String itemName, sportName, brand, rating;
	
	
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", price=" + price + ", itemName=" + itemName + ", sportName=" + sportName
				+ ", brand=" + brand + ", rating=" + rating + "]";
	}
	
	
	
}


