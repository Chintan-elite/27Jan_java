<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
		<form:form action="addUser" modelAttribute="user">
		<form:label path="name">Username</form:label>
		<form:input path="name"/>
		
		<form:label path="email">Email</form:label>
		<form:input path="email"/>
		
		<input type="submit">
		</form:form>
</body>
</html>