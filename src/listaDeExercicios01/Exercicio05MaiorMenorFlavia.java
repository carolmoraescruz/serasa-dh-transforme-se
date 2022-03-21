package listaDeExercicios01;

public class Exercicio05MaiorMenorFlavia {

	public static void main(String[] args) {
		int numero1 = 3;
		int numero2 = 7;
		int numero3 = 9;
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O número maior é: " + numero1);
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O número maior é: " + numero2);
		}
		else {
			System.out.println("O número maior é: " + numero3);
		}
		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O número menor é: " + numero1);
		}
		else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O número menor é: " + numero2);
		}
		else {
			System.out.println("O número menor é: " + numero3);
		}

	}

}
