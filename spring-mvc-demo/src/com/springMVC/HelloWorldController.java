package com.springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		String theName = request.getParameter("name");
		
		theName = theName.toUpperCase();
		
		String result = "Yo " + theName;
		
		model.addAttribute("message", result);
		
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("name") String theName,Model model) {
		
		
		theName = theName.toUpperCase();
		
		String result = "Hey man i , here " + theName;
		
		model.addAttribute("message", result);
		
		
		return "helloworld";
	}
}
