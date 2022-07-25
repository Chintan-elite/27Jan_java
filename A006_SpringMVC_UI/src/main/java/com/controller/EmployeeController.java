package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/employeeHome")
	public ModelAndView emphome()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("employee",new Employee());
		model.addObject("data",employeeService.getAllEmp());
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/addEmp")
	public ModelAndView addEmp(@ModelAttribute("employee") Employee emp)
	{
		ModelAndView model = new ModelAndView();
		employeeService.addOrUpdateEmp(emp);
		model.setViewName("redirect:employeeHome");
		return model;
	}
	
	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmp(@RequestParam("did") int id)
	{
		ModelAndView model = new ModelAndView();
		employeeService.deleteEmp(id);
		model.setViewName("redirect:employeeHome");
		return model;
	}
	
	@RequestMapping("/updateEmp")
	public ModelAndView updateEmp(@RequestParam("uid") int id)
	{
		ModelAndView model = new ModelAndView();
		model.addObject("employee",employeeService.getById(id));
		model.addObject("data",employeeService.getAllEmp());
		model.setViewName("home");
		return model;
	}
	
}
