package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/form")
public class nomeForm {

	@RequestMapping
	public ModelAndView form(PersonForm personForm) {
		//todo nao está pegando o bootstrap
		ModelAndView pagina = new ModelAndView("form");
		return pagina;
	}

}
