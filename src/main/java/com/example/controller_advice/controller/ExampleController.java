package com.example.controller_advice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller_advice.exception.MyExampleException;
import com.example.controller_advice.service.ExampleService;

/**
 * Controlador de ejemplo
 * 
 * @author isivroes
 *
 */
@RestController
@RequestMapping("/example")
public class ExampleController {

	@Autowired
	ExampleService exampleService;

	@GetMapping("/nullPointerException")
	public void throwNullPointerException() {
		exampleService.throwNullPointerException();
		System.out.println("Continua end-point");
	}

	@GetMapping("/myExampleException")
	public void throwMyExampleException() throws MyExampleException {
		exampleService.throwMyExampleException();
	}
}
