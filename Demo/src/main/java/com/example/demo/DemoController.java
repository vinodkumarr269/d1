package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	ModelAndView model = new ModelAndView();
	@GetMapping("/")
		public ModelAndView openHomePage() {
		model.addObject("x", "Hello");
		model.setViewName("check.jsp");
		return model;
		
		}


}
