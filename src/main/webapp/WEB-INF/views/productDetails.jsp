<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
<style>
.design{
  background-color:#00ff80;
  border: 2px solid black;
  margin: 20px;
  padding: 100px;
}
</style>
</head>
<body>
<br>
<br>
<br>
<br>
<center class="design">
<h3> Product Id   : ${productDetail.itemId}</h3>
<h3> Product Name   : ${productDetail.itemName}</h3>
<h3> Sport Name  : ${productDetail.sportName}</h3>
<h3> Brand   : ${productDetail.brand}</h3>
<h3> Price   : ${productDetail.price}</h3>
<h3> Rating   : ${productDetail.rating}</h3>
</center>

</body>
</html>