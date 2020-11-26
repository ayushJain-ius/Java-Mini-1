<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<style>
.design{
	 background-color:#00bfff;
  color: white;
  border: 2px solid black;
  margin: 20px;
  padding: 20px;
}
</style>
</head>
<body>
<div class="design">
<center><form :form method="POST" action="/productAddition">
	<h1>Product Details</h1><br> 
	           
	<label for="itemName">Item Name</label><br>
	<input type="text" id="itemName" name="itemName" required><br><br>
	<label for="sportName">Sport Name</label><br>
	<input type="text" id="sportName" name="sportName" required><br><br>
	<label for="brand">Brand</label><br>
	<input type="text" id="brand" name="brand" required><br><br>
	<label for="price">Price</label><br>
	<input type="number" id="price" name="price" required><br><br>
	<label for="rating">Rating</label><br>
	<input type="text" id="rating" name="rating" required><br><br>
	<button type="submit" value="submit">Submit</button>
</form></center>
</div>
</body>
</html>