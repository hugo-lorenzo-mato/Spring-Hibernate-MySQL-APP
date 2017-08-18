package com.SpringHibernateHugoLM.backendSPRHIB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Encargado de gestionar las peticiones que el navegador nos realiza
 * y de mandarle una vista al mismo 
 * 
 */

//Queremos que sea un bean, no una clase normal. El padre es component pero se trata clase diseñada para gestionar vistas
@Controller
@RequestMapping("/say")
public class HelloWorldController {
	
	/*
	 * Devolvemos el nombre de la vista
	 */
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "helloworld";		
	}

}
