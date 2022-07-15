package com;

import java.net.http.HttpRequest;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Listener implements HttpSessionListener
{
	int current = 0;
	int total = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		current++;
		total++;
		System.out.println(current+" "+total);
		ServletContext sx = se.getSession().getServletContext();
		sx.setAttribute("currentUser", current);
		sx.setAttribute("totalUser",total);
		
	
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		current--;
		ServletContext sx = se.getSession().getServletContext();
		sx.setAttribute("currentUser", current);
		
	}
}
