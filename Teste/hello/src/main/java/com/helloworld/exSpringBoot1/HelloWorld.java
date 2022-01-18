package com.helloworld.exSpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {

	// CRIA-SE CLASSES PARA CADA PATH ('/') DO SITE
	// Basta rodar o próprio arquivo
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
		
	}

}
