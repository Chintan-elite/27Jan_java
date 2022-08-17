
<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="imgaeUpload" method="post" enctype="multipart/form-data">
		<input type="text" name="uname" placeholder="Enter Username">
		<input type="file" name="file">		
		<input type="submit">
		</form>
		
		
		<h1>User data</h1>
		
		<table border="1"> 
		<tr>
		<th>id</th>
		<th>uname</th>
		<th>image</th>
		</tr>
		
		<%
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
		PreparedStatement ps = cn.prepareStatement("select * from upload");
		ResultSet rs = ps.executeQuery();
		
		String path =   request.getServletContext().getRealPath("img");
		
		while(rs.next())
		{ %>
			<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2) %></td>
			
			<td><img alt="<%=rs.getString(3) %>" src="img/<%=rs.getString(3)%>"> </td>
			</tr>
			
		<%}
		
		%>
		
		
		</table>
		
</body>
</html>