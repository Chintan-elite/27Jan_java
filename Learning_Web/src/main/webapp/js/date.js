/**
 * 
 */

function mydate()
{
	var val = document.getElementById("date");
	var dt = new Date();
	val.innerHTML=dt;
}

//setTimeout(mydate(),5000);
setInterval(mydate,1000)