package com.hellokoding.springboot;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/meds")
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("name", name);

		// antiga forma usando Model
		// addAttribute("name", name);
		return modelAndView;
	}

	@RequestMapping("/home")
	public String helloTest(Model model) {

		int numero = 9;

		Date date = new Date();
		date.getTime();

		model.addAttribute("serverTime", date);
		model.addAttribute("numero", numero);

		return "index";
	}

	// TODO implementar a listagem
	@RequestMapping("/sobre")
	public ModelAndView lista(ModelAndView usuarios) {
		ModelAndView listaUser = new ModelAndView("sobre");

		return listaUser;
	}
}
