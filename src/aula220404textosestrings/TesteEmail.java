package aula220404textosestrings;

public class TesteEmail {
	
	public static void main(String[] args) {
		
		ExpressoesRegulares emailValido = new ExpressoesRegulares("teste@teste.com.br");
		System.out.println("E-mail: " + emailValido.getEmail());
		
		ExpressoesRegulares emailInvalido = new ExpressoesRegulares("testeteste.com.br");
		
		ExpressoesRegulares2 telefoneValido = new ExpressoesRegulares2("21", "999999999");
		System.out.println(telefoneValido.toString());
		
		ExpressoesRegulares2 dddInvalido = new ExpressoesRegulares2("210", "999999999");
		
		ExpressoesRegulares2 telefoneInvalido = new ExpressoesRegulares2("21", "9999999990");
		
	}

}
