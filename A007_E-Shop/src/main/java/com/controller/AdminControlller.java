package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Category;
import com.model.Product;
import com.service.CategoryService;
import com.service.UserProfileService;

@Controller
public class AdminControlller {
	
	@Autowired
	UserProfileService userProfileService;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/adminlogin")
	public ModelAndView adminLogin()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("adminlogin");
		return model;
	}
	
	@RequestMapping("/adminHome")
	public String adminHome()
	{
		return "adminhome";
	}
	
	@RequestMapping("/users")
	public ModelAndView adminUsers()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("data",userProfileService.getallUsers());
		
		model.setViewName("adminuser");
		return model;
	}
	//*************************category********************
	
	@RequestMapping("/categories")
	public ModelAndView productCategory()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("category",new Category());
		model.addObject("data",categoryService.getAllCategory());
		model.setViewName("productCategory");
		return model;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "addCatagory")
	public ModelAndView addCatagory(@ModelAttribute("catagory") Category category)
	{
		ModelAndView model = new ModelAndView();
		categoryService.addOrUpdateCate(category);
		model.setViewName("redirect:categories");
		return model;
	}
	
	@RequestMapping("updateCat")
	public ModelAndView updatecat(@RequestParam("uid") int uid)
	{
		ModelAndView model = new ModelAndView();
		model.addObject("category",categoryService.getCatById(uid));
		model.addObject("data",categoryService.getAllCategory());
		model.setViewName("productCategory");
		return model;
	}
	
	@RequestMapping("deleteCat")
	public ModelAndView deleteCat(@RequestParam("uid") int uid)
	{
		ModelAndView model = new ModelAndView();
		categoryService.deleteCategory(uid);
		model.setViewName("redirect:categories");
		return model;
	}
	
	
	
	
	
	//*************************product********************
	
		@RequestMapping("/products")
		public ModelAndView product()
		{
			ModelAndView model = new ModelAndView();
			model.addObject("product", new Product());
			model.addObject("categories", categoryService.getAllCategory());
			model.setViewName("product");
			return model;
		}
}
