package testes.unitarios;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadastrarEmailTest {

	@Test
	public void testEmailValido() {
		assertTrue(CadastrarEmail.isValid("test-test@gmail.com"));
		assertTrue(CadastrarEmail.isValid("test-test@gmail.com.br"));
	}

	@Test
	public void testEmailInvalido() {
		assertFalse(CadastrarEmail.isValid("duende.com.br"));
		assertFalse(CadastrarEmail.isValid("duende2com"));
	}
}
