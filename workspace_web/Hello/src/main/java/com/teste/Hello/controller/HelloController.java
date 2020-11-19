package com.teste.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * 
 */


@RestController
public class HelloController {
	
	/*
	 * a anotação informa que o metodi sayhello ia responder na url
	 * 
	 * que é formada da seguinte maneira
	 * 
	 */
	@GetMapping("/helloworld")
	public String sayHello() {
		return "Hello, exemplo springboot";
		
	}
	
	@GetMapping("/saygoodbye")
	public String sayGoodbye() {
		return "outro metodo";
	}
	
	
	

}
