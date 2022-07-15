package com;

public class User {
	int id;
	String uname,email,pass,adr;
	public User(int id, String uname, String email, String pass, String adr) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.pass = pass;
		this.adr = adr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	
	
	
	
}
