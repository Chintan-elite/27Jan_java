<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<!-- 	Declarative tag -->
		<%! private int a = 10;
		    private int b = 20; %>
		
		<!-- scriplet Tag -->
		<%
			Scanner sc = new Scanner(System.in);
			/* int i;
			for (i=0;i<10;i++)
			{
				out.print(i);
			} */
		   out.print(a+b);
			
			/* int a = 10;
			int b = a/0; */
			
			int a[] = new int[5];
			a[10] = 50;
			
		%>
	
	<!-- Expression tag -->
	<%=a%>
	<%=b%>
		
</body>
</html>