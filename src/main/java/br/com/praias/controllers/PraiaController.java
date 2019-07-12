package br.com.praias.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.praias.services.PraiaService;

@Controller
public class PraiaController {

	@Autowired
	PraiaService praiaService;
	
	@GetMapping("/")
	public ModelAndView praias() {
		ModelAndView modelAndView = new ModelAndView("index.html");
		modelAndView.addObject("praias", praiaService.praias());
		return modelAndView;
	}
	
	
}
