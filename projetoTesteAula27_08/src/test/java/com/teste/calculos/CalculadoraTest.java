package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName (" Teste 20 + 10 = 30")
	void testSum() {
		//Arrange
		Calculadora calc = new Calculadora ();
		double valor1 = 20D;
		double valor2 = 10D;
		double esperado = 30D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20 + 10 não gerou o valor 30");
	}
	
	@Test
	@DisplayName (" Teste 20 - 10 = 10")
	void testSub() {
		//Arrange
		Calculadora calc = new Calculadora ();
		double valor1 = 20D;
		double valor2 = 10D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20 - 10 não gerou o valor 10");
	}
	
	@Test
	@DisplayName (" Teste 20 * 10 = 200")
	void testMult() {
		//Arrange
		Calculadora calc = new Calculadora ();
		double valor1 = 20D;
		double valor2 = 10D;
		double esperado = 200D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20 * 10 não gerou o valor 200");
	}

	@Test
	@DisplayName (" Teste 20 / 10 = 2")
	void testDiv() {
		//Arrange
		Calculadora calc = new Calculadora ();
		double valor1 = 20D;
		double valor2 = 10D;
		double esperado = 2D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "20 / 10 não gerou o valor 2");
	}
}
