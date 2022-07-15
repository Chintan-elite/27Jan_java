package com;

import java.util.List;
import java.util.Set;

public class Student {
	
	int id;
	String name;
	String email;
	List<String> sub;
	Set<String> lang;
	List<Address> adr;
	Stream str;
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
		System.out.println("****Subject****");
		for(String s : sub)
		{
			System.out.println(s);
		}
		System.out.println("****Languages****");
		for(String l : lang)
		{
			System.out.println(l);
		}
		System.out.println("****Address****");
		for(Address a : adr)
		{
			a.display();
		}
		System.out.println("****Stream****");
		str.display();
	}
	
	
	
	public Stream getStr() {
		return str;
	}



	public void setStr(Stream str) {
		this.str = str;
	}



	public List<Address> getAdr() {
		return adr;
	}



	public void setAdr(List<Address> adr) {
		this.adr = adr;
	}



	public Set<String> getLang() {
		return lang;
	}



	public void setLang(Set<String> lang) {
		this.lang = lang;
	}



	public List<String> getSub() {
		return sub;
	}



	public void setSub(List<String> sub) {
		this.sub = sub;
	}



	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
