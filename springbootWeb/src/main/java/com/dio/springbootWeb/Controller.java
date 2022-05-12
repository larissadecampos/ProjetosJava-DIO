package com.dio.springbootWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String mensagem() {
		return "Relembrando conceitos de um projeto Spring Boot Web";
	}

}
