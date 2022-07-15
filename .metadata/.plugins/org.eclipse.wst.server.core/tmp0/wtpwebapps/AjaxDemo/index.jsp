<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  <script type="text/javascript">
   $(document).ready(function(){
	  
	   $.get("country",{},function(rt){
		   
		   $("#countryData").html(rt);
	   })
	   
   })
  
   $("#btn").click(function(){
	   var uname = $("#uname").val();   
		
		$.get("data",{uname:uname},function(responseText){
			alert(responseText);
		})
   })
   
   function getstate(val){
	  
	   $.get("state",{val},function(rt){
		   $("#stateData").html(rt);
	   })
   }
  
   	function getProduct(val)
   	{
   		$.get('product',{val},function(rt){
   			$("#productList").html(rt);
   		})
   	}
   
  </script>
  
  
</head>
<body>
	<input type="text" id="uname">
	<button id="btn">Send</button>
	
	
	<select id="countryData" onchange="getstate(value)">
	<option value="">---Select country---</option>
	</select>
	
	
	<select id="stateData">
	<option value="">---Select state---</option>
	</select>
	
	<input type="text" placeholder="Search Product" id="product" onkeyup="getProduct(value)">

	<div id="productList"></div>
</body>
</html>