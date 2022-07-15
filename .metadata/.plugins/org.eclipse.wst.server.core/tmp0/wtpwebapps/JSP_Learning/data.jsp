<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="r" class="com.User"></jsp:useBean>
	    <jsp:setProperty property="*" name="r" />
		
		<%
		request.setAttribute("user", r);
		request.getRequestDispatcher("display").forward(request, response);
		
		%>
		
	
</body>
</html>