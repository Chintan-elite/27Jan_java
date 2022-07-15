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
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		loadData();
		
		$("#search").keyup(function(){
			var value =  $("#search").val();
			$.get("searchProduct",{val:value},function(rs){
				$("#pdata").html(rs);
			})
		})
		
		$("#add").click(function(){
			
			var pid = $("#pid").val();
			var pname = $("#pname").val();
			var price = $("#price").val();
			
			$.get("addProduct",{pid,pname,price},function(rt){
				alert(rt);
				loadData();
			})
			
		})
		
	})
	
	
	
	
	function loadData()
	{
		$.get("product",{},function(response){
			//alert(response);
			$("#pdata").html(response);
		})
	}
	
	function deleteData(pid)
	{
		$.get("update",{"action":"delete",uid:pid},function(rt){
			alert(rt);
			loadData();
		})
	}
	
	function updateData(pid)
	{
		$.get("update",{"action":"update",uid:pid},function(rt){
			
			const product = JSON.parse(rt);
			$("#pid").val(product.pid);
			$("#pname").val(product.pname);
			$("#price").val(product.price);
			
			loadData();
		})
	}
	</script>

</head>
<body>
			<div class="container">
			<div class="row">
			<div class="col-md-4 m-auto">
			<h1 align="center"> Product List</h1>
			<input type="hidden" id="pid">
			<div class="form-group">
			<label>Product Name</label>
			<input type="text" name="pname" id="pname" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Product Price</label>
			<input type="text" name="price" id="price" class="form-control">
			</div>
			<br>
			<button class="btn btn-success" id="add">Add Product</button>
			
			<br><br>
			
			<div class="form-group">
			<input type="text" name="search" id="search" class="form-control" placeholder="Search Product">
			</div>
			
			<div id="pdata"></div>
			
			</div>
			</div>
			</div>
</body>
</html>
