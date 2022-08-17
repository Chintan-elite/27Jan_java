package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.UserProfile;
import com.service.CategoryService;
import com.service.ProductService;
import com.service.UserProfileService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class Usercontroller {
	
	@Autowired
	UserProfileService userProfileService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
			ModelAndView model = new ModelAndView();
			model.addObject("categories",categoryService.getAllCategory());
			model.addObject("products",productService.getAllProduct());
			model.setViewName("index");
			return model;
	}
	
	@RequestMapping("/userLogin")
	public String userLogin()
	{
		return "login";
	}
	
	@RequestMapping("/userReg")
	public ModelAndView userReg()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("userProfile", new UserProfile());
		model.setViewName("registration");
		return model;
	}
	
	@RequestMapping(value = "/userRegistration",method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userProfile") UserProfile p)
	{
		userProfileService.addOrUpdateUser(p);
		return "registration";
	}
	
	
	
}
