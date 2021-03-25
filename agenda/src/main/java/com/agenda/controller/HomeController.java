package com.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * Segue comentários do professor sobre o desenvolvimento da aplicação
 * */

@Controller
public class HomeController {
	
	@GetMapping
	public String home() {
		return "index";
	}
}
