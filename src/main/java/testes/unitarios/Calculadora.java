package testes.unitarios;

public class Calculadora {

	public static int somar(int n, int n1) {
		int resultado = n+n1;
		return resultado;
	}
	
	public static int dividir(int n, int divisor) {
		int resultado = n/divisor;
		if (divisor == 0) {
			throw new ArithmeticException("Não é possível dividir por zero");
		}
		return resultado ;
	}
}
