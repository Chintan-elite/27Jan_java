<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>About Us</h1>

<jsp:include page="header.jsp"></jsp:include>
<jsp:forward page="home.jsp">
 <jsp:param value="Topstech" name="name"/>
</jsp:forward>
</body>
</html>