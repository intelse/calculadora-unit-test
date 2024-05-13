package testes.unitarios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest{

	@Test
	public void test() {
		int resultado = Calculadora.somar(10, 5);
		assertEquals(15, resultado);
		System.out.println(resultado);
	}
	@Test(expected = ArithmeticException.class) 
	public void testDivisaoPorZero() {
		int resultado = Calculadora.dividir(10, 0);
		System.out.println(resultado);
	}
	@Test
	public void testDividir() {
		int resultado = Calculadora.dividir(10, 2);
		assertEquals(5, resultado);
		System.out.println(resultado);
	}

}
