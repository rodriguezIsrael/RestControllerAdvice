package com.example.controller_advice.service;

import org.springframework.stereotype.Service;

import com.example.controller_advice.advice.ExceptionAdvice;
import com.example.controller_advice.exception.MyExampleException;

/**
 * Clase de servicio que genera excepciones para poder probar el correcto
 * funcionamiento de {@link ExceptionAdvice}
 * 
 * @author isivroes
 * @since 15/01/2020
 *
 */
@Service
public class ExampleService {

	public void throwNullPointerException() {

		throw new NullPointerException("Ocurre un null pointer exception");

	}

	public void throwMyExampleException() throws MyExampleException{
		throw new MyExampleException("Ocurrio un error de tipo MyExampleException");
	}
}
