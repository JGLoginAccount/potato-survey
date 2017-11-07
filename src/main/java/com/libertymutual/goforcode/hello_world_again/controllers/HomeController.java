package com.libertymutual.goforcode.hello_world_again.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private int russetCount;
	private int sweetCount;
	private int noneCount;
	private int goldCount;

	@RequestMapping("/")

	public String defaultPage() {
		return "potato";
	}

	@RequestMapping("/twice-baked")

	public ModelAndView twiceBaked() {

		ModelAndView carbs = new ModelAndView();
		carbs.setViewName("spuds");
		carbs.addObject("variety", "YukonGold");
		carbs.addObject("temperature", 450);
		carbs.addObject("timecook", 2);

		return carbs;
	}

	@RequestMapping("/survey")

	public ModelAndView survey(String answer) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("results");
		mv.addObject("userResponse", answer);

		if (answer.equals("Sweet")) {
			sweetCount=sweetCount+1;
		}
		if (answer.equals("Russet")) {
			russetCount=russetCount+1;
		}
		if (answer.equals("Yukon Gold")) {
			goldCount=goldCount+1;
		}
		mv.addObject("russetCount", russetCount);
		mv.addObject("goldCount", goldCount);
		mv.addObject("sweetCount", sweetCount);
		
		
		
		return mv;
	}

}
