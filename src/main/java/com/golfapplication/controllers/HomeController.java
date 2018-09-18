package com.golfapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/hello")
	public ModelAndView test() {
		ModelAndView homePage = new ModelAndView();
		homePage.setViewName("home");
		return homePage;
	}

}
