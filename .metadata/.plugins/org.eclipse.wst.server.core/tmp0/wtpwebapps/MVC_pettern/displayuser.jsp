<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
	<div class="row">
		<div class="col-md-6 m-auto">
		<%
		User ud = (User)request.getAttribute("user");
		
		%>
		<h1 align="center">User List</h1>
			<form action="reg">
				<input type="hidden" value="<%=ud.getUid()%>" name="uid">
				<div class="form-group">
					<label>Username</label> <input type="text" name="uname"
						placeholder="Enter username" class="form-control" value="<%=ud.getUname()%>">
				</div>
				<div class="form-group">
					<label>Password</label> <input type="text" name="pass"
						placeholder="Enter password" class="form-control" value="<%=ud.getPass()%>"> <br>
				</div>
						<input type="submit" class="btn btn-success">
			
			</form>

		</div>
	</div><br>
	<div class="row">
		<div class="col-md-6 m-auto">
			
			<table class="table">
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Password</th>
					<th colspan="2">Action</th>
				</tr>

				<%
				ArrayList<User> al = (ArrayList) request.getAttribute("data");
				int k=1;
				for (User u : al) {
				%>
				<tr>
					<td><%=k%></td>
					<td><%=u.getUname()%></td>
					<td><%=u.getPass()%></td>
					<td><a class="btn btn-danger" href="update?action=delete&&uid=<%=u.getUid()%>">Delete</a></td>
					<td><a class="btn btn-warning" href="update?action=update&&uid=<%=u.getUid()%>">Update</a></td>
				</tr>
				<% k++;}
				
			%>
			</table>
		</div>
	</div>
</div>
</body>
</html>