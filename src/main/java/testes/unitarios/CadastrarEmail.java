package testes.unitarios;

public class CadastrarEmail {

	public static boolean isValid(String email) {
		return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
	}

}
