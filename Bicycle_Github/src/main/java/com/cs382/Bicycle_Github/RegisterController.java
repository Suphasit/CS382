package com.cs382.Bicycle_Github;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/","/register"})
public class RegisterController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String showUp(){
		
		return "register";
	}
}
