package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Student;

public class Mainclass {
	public static void main(String[] args) {
		
		ApplicationContext context =new  ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student std = context.getBean("std",Student.class);
		
		std.display();
		
	}
}
