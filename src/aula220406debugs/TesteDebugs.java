package aula220406debugs;

public class TesteDebugs {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.soma(5, 4);
		System.out.println("Subtração: " + calc.subtracao(10, 8));
		
		Calculadora.multiplicacao(2, 2);

	}

}
