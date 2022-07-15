    function start()
	{
		//alert("ok..Js calling!!!")
	}

	function getdata()
	{
		var uname =  document.getElementById("uname").value;
		alert(uname);
	}
	
	function unameData(val)
	{
		//alert(val);
		var dt = document.getElementById("unameData");
		dt.innerHTML=val;
	}
	
	function textClick()
	{
		var uname =  document.getElementById("uname");
		
		uname.style.backgroundColor = 'pink';
		uname.style.width = "150px";
		uname.style.height ="30px";
	}
	
	
	var dt =new Date();
	document.getElementById('date').innerHTML=dt;
	