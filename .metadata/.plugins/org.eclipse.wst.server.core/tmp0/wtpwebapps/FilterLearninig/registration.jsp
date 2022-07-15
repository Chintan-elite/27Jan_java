<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
    <title>Hello, world!</title>
    
    
    <style type="text/css">
    
    .err
    {
    	color: red;
    }
    </style>
  </head>
  <body>
  
  	<div class="container">
  	<div class="row">
  	<div class="col-md-4"></div>
  	<div class="col-md-4">
  	
  	<h1 class="text-success">Registration form</h1>
  	<form action="reg"  method="post">
  	
  	<div class="form-group">
  	<label>Username</label>
  	<input type="text" name="uname" class="form-control" id="uname" value="<%if(request.getParameter("uname") != null){%><%=request.getParameter("uname")%><%}%>">
  	<span id="unameE" class="text-danger">${unameE}</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Email</label>
  	<input type="text" name="email" class="form-control" id="email" value="<%if(request.getParameter("email") != null){%><%=request.getParameter("email")%><%}%>">
  	<span id="emailE" class="text-danger">${emailE}</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Password</label>
  	<input type="text" name="pass" class="form-control" id="pass" value="<%if(request.getParameter("pass") != null){%><%=request.getParameter("pass")%><%}%>">
  	<span id="passE" class="text-danger">${passE }</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Confirm Password</label>
  	<input type="text" class="form-control" id="cpass"  name="cpass" value="<%if(request.getParameter("cpass") != null){%><%=request.getParameter("cpass")%><%}%>">
  	<span id="cpassE" class="text-danger">${cpassE }</span>
  	</div>
  	
  	<div class="form-group">
  		<label>Address</label>
  	<input type="text" name="adr" class="form-control" id = "adr" value="<%if(request.getParameter("adr") != null){%><%=request.getParameter("adr")%><%}%>" >
  	<span id="adrE" class="text-danger">${adrE}</span>
  	</div>
  	<br>
  	<input type="submit" class="btn btn-success" id="sbtn">
  	<input type="reset" class="btn btn-info">
  	</form>
  	
  	
  	
  	
  	</div>
  	<div class="col-md-4"></div>
  	</div>
  	
  		
  	
  	</div>
  
  	
  
  
  
  
  
  
  
  </body>
</html>