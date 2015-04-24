package com.cs382.Bicycle_Github;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/addCustomer")
public class CustomerAdder {
	
	@RequestMapping(method=RequestMethod.POST)
	public String addCustomer(@ModelAttribute("registerForm")Customer customer){
		String fname = customer.getFname();
		String lname = customer.getLname();
		String id = customer.getCitizenID();
		
		//Check is blank input
		if(fname=="" || lname=="" || id==""){
			
			//Add customer to database
			
			return "redirect:/error";
		}
		else{
			return "redirect:/result";
		}
	}
}
