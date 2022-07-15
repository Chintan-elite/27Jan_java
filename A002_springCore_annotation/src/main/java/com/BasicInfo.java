package com;

import org.springframework.stereotype.Component;

@Component
public class BasicInfo implements CustomerDetails {

	int id;
	String name;
	
	public BasicInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public void getBasicInformation() {
	
		System.out.println(id+" "+name);
		
	}

	
}
