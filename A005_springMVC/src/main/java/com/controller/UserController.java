package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		ArrayList<User> allUser = userService.getallUser();
		User user = new User();
		model.addObject("user",user);
		model.addObject("data",allUser);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(@ModelAttribute("user") User u)
	{
		//System.out.println(u.getName()+" "+u.getEmail());
		userService.addOrUpdateUser(u);
		ModelAndView model = new ModelAndView();
		ArrayList<User> allUser = userService.getallUser();
		User user = new User();
		model.addObject("user",user);
		model.addObject("data",allUser);
		model.setViewName("index");
		return model;
		
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteUser(@RequestParam("did") int did)
	{
		userService.deleteUser(did);
		ModelAndView model = new ModelAndView();
		ArrayList<User> allUser = userService.getallUser();
		User user = new User();
		model.addObject("user",user);
		model.addObject("data",allUser);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateUser(@RequestParam("uid") int uid)
	{
		ModelAndView model = new ModelAndView();
		ArrayList<User> allUser = userService.getallUser();
		User user = userService.getUserById(uid);
		model.addObject("user",user);
		model.addObject("data",allUser);
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	
}
