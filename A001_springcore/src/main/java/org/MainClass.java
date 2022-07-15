package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext2.xml");
		
		Question que = context.getBean("q", Question.class);
		que.display();
		
	}
}
