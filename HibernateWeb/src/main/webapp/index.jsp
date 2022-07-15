<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
		<form action="reg" method="post">
		<input type="hidden" name="id" value="${data.getId()}">
		<input type="text" name="name" placeholder="enter emploee name" value="${data.getName()}">
		<input type="text" name="email" placeholder="enter employee email" value="${data.getEmail()}">
		<input type="text" name="dept" placeholder="enter employee dept" value="${data.getDept()}">
		<input type="submit">
		</form>
		<a href="display">view all Data</a>
</body>
</html>