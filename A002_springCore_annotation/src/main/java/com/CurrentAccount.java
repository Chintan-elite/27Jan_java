package com;

import org.springframework.stereotype.Component;

@Component("current")
public class CurrentAccount implements BankAccount {

	public void getBalnce() {
		
		System.out.println("This is current account balance!!!");
	}

}
