<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
</head>
<body>
	<form action="AddNewProduct">
	<select name="catid">
	<c:forEach var="dt" items="${data}">
	<option value="${dt.getcId()}">${dt.getCatName()}</option>
	</c:forEach>
	</select>
	<input type="text" name="pname" placeholder="Product name">
	<input type="text" name="price" placeholder="Product Price">
	<input type="submit">
	</form>
	
	<h1>Products</h1>
	<table border="1">
	<tr>
	<th>Id</th>
	<th>Pname</th>
	<th>Price</th>
	<th>Category</th>
	</tr>
	<c:forEach var="prod" items="${products}">
	<tr>
	<td>${prod.getpId()}</td>
	<td>${prod.getpName()}</td>
	<td>${prod.getPrice()}</td>
	<td>${prod.getCategory().getCatName()}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>