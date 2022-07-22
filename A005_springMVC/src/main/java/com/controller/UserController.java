package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView();
		User user = new User();
		model.addObject("user",user);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/addUser")
	public void addUser(@ModelAttribute("user") User u)
	{
		//System.out.println(u.getName()+" "+u.getEmail());
		userService.addOrUpdateUser(u);
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	
}
