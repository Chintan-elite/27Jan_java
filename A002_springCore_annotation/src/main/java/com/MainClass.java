package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
//		BankAccount savingAccount = new SavinfAccount();
//		BankAccount loanAccount = new LoanAccount();
//		BankAccount currentAccount = new CurrentAccount();
//		savingAccount.getBalnce();
//		loanAccount.getBalnce();
//		currentAccount.getBalnce();
//		
		AnnotationConfigApplicationContext contxt = 
				new AnnotationConfigApplicationContext(Appconfig.class);
		
		BankAccount account1 = contxt.getBean("savingAccount",BankAccount.class);
		account1.getBalnce();
		
//		BankAccount account2 = contxt.getBean("loanAccount",BankAccount.class);
//		account2.getBalnce();
//		
//		BankAccount account3 = contxt.getBean("current",BankAccount.class);
//		account3.getBalnce();
//		
	}
}
