<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product!!</title>
<style>
.design{
	 background-color:SlateBlue;
  color: white;
  border: 2px solid black;
  margin: 20px;
  padding: 100px;
}
</style>
</head>
<body>
<form :form method="POST" action="/productDetails">
<center class="design">

<h2><label for="itemId">Enter Item Id</label></h2>
<input type="number" id="itemId" name="itemId"><br><br>
<input type="submit" value="Submit">
</center>
</form>
</body>
</html>