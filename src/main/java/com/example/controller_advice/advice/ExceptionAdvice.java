package com.example.controller_advice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.controller_advice.exception.MyExampleException;

/**
 * Controller Advice que cacha cada una de las excepciones no controladas
 * interrumpiendo el flujo en el que se encuentre el proceso y realizando un
 * response
 * 
 * @author isivroes
 * @since 15/01/2020
 */
@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> handleNullPointerException(NullPointerException e) {
		System.out.println("Se ejecuta automaticamente exeption advice: metodo:  handleNullPointerException");
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	
	@ExceptionHandler(value = MyExampleException.class)
	public ResponseEntity<Object> handleMyExampleException(MyExampleException e) {
		System.out.println("Se ejecuta automaticamente exeption advice: metodo:  handleMyExampleException");
		return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
