package listaDeExercicios01;

public class Exercicio05MaiorMenor {

	public static void main(String[] args) {
		int numero1 = 3;
		int numero2 = 6;
		int numero3 = 10;
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O número maior é: " + numero1);
			if (numero2 < numero3) {
				System.out.println("O número menor é: " + numero2);
			} else {
				System.out.println("O número menor é: " + numero3);
			}
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O número maior é: " + numero2);
			if (numero1 < numero3) {
				System.out.println("O número menor é: " + numero1);
			} else {
				System.out.println("O número menor é: " + numero3);
			}
		}
		
		else {
			System.out.println("O número maior é: " + numero3);
			if (numero1 < numero2) {
				System.out.println("O número menor é: " + numero1);
			} else {
				System.out.println("O número menor é: " + numero2);
			}
		}

	}

}
