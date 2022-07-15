<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<title>Registration</title>
</head>
<body>

	<div class="container">
	<div class="col-md-4 m-auto">
	<h1>Registration Form</h1>
	<span class="text-success">${msg}</span>
	<form action="reg" method="post">
	<div class="form-group">
	<lable>Username</lable>
	<input type="text" name="uname" class="form-control">
	</div>
	
	<div class="form-group">
	<label>Email</label>
	<input type="text" name="email" class="form-control">
	</div>
	
	<input type="submit" class="btn btn-success">
	<input type="reset" class="btn btn-primary">
	</form>
	</div>
	</div>
</body>
</html>