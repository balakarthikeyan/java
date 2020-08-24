package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class CrunchifyHelloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<div style='text-align:center;'>"
							+ "<h3>Hello World, Spring MVC Tutorial</h3>"
							+ "<p>This message is coming from CrunchifyHelloWorld.java</p>"
							+ "</div>";
		return new ModelAndView("welcome", "message", message);
	}

}
