package com.cs382.Bicycle_Github;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/error")
public class RegisterErrorController {
	@RequestMapping(method=RequestMethod.GET)
	public String showUp(){
		return "register-error";
	}
}
