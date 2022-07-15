package com;

import java.util.Random;

public class OTPGenatation {
	public static void main(String[] args) {
		
		
		Random rad = new Random();
		int otp =  rad.nextInt(999);
		System.out.println(otp);
		
		
	}
}
