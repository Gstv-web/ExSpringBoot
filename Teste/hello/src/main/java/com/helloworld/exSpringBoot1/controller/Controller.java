package com.helloworld.exSpringBoot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controlador de endpoint/importa o controller

public class Controller {
	
	// CRIA-SE MÉTODOS OU CLASSE PARA CADA PATH ('/') DO SITE
	@GetMapping("/hello") // "metodo http get"
	public String exercicio1() {
		return "Hello World!";
	}
	
	@GetMapping("/aprender")
	public String exercicio2() {
		return "E espero aprender como que faz uma API de vez!";
	}
	
	
}
