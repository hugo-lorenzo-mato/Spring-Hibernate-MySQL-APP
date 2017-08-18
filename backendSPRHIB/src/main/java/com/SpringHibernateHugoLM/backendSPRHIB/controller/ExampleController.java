package com.SpringHibernateHugoLM.backendSPRHIB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	//Muy útil por si cambiamos el nombre de la vista llegado un momento
	public static final String EXAMPLE_VIEW = "example";

	/*
	 * Si escribimos en la petición /exampleString nos devolverá
	 * la vista el primer método. Si escribimos /exampleMAV, el segundo.
	 */
	
	//Primera forma de devolver una vista. Útil para redirecciones o insertar pocos datos
	/*
	@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	public String exampleString() {
		return EXAMPLE_VIEW;
	}
	*/
	
	//Segunda forma. Útil cuando hay que insertar muchos datos
	@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		mav.addObject("name", "Pepito Grillo");
		return mav;
	}
	
	//En Spring 4.3 anotaciones hijo para evitar replicar siempre el method
	
	@GetMapping(value="/exampleString")
	public String exampleString(Model model) {
		model.addAttribute("name", "Hugo");
		return EXAMPLE_VIEW;
	}
	
	
}
