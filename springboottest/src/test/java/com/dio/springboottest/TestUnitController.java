package com.dio.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dio.springboottest.controller.TestController;

public class TestUnitController {
	
	@Test 
	public void testUnit() { //método
		TestController controller = new TestController(); //instanciando a classe
		String resultado = controller.saudacao("DIO"); //variável
		assertEquals("Bem-vinde, DIO", resultado);
	}

}
