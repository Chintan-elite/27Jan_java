<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String uname = (String)session.getAttribute("uname");
	if(uname==null)
	{
		request.setAttribute("err", "Please login first");
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	%>

<h1>Products</h1>
<ul>
<li>Mobile</li>
<li>TV</li>
<li>Fridge</li>
<li>Laptop</li>
<li>Keyboard</li>

</ul>
<h3><a href="logout">Logout</a></h3>
</body>
</html>