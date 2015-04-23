package com.cs382.Bicycle_Github;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class RegisterController {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message","Hello");
		return "register";
	}
	@RequestMapping(value="/result",method = RequestMethod.POST)
	public String goToResult(){
		
		return "redirect:/register-result";
	}
	

}
