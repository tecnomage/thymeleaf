package com.hellokoding.springboot;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping("/home")
	public String helloTest(Model model) {

		int numero = 9;
		
		Date date = new Date();
		date.getTime();
		
		model.addAttribute("serverTime",date);
		model.addAttribute("numero", numero);
		
		return "index";
	}
}
