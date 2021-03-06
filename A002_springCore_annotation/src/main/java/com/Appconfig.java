package com;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class Appconfig {

		Scanner sc = new Scanner(System.in);
	
		
		@Bean("basicInfo")
		public BasicInfo setData()
		{
			System.out.println("eneter Id: ");
			int id = sc.nextInt();
			System.out.println("Enter name : ");
			String name = sc.next();
			return new BasicInfo(id,name);
		}
		
		
		@Bean("addressInfo")
		public AddressInfo setAddressData()
		{
		  return  new AddressInfo("Baroada", "689574");
		}
	
}
