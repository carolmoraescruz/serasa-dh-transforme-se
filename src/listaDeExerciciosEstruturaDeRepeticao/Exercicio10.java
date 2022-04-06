package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro maior que 1: ");
		int numero = leia.nextInt();
		
		if (numero <= 1) {
			System.out.println("Digite um número válido.");
		}
		else if (numero == 2) {
			System.out.println("É um número primo.");
		}
		else if (numero >= 3) {
			if ((numero % 2) == 0) {
				System.out.println("Não é um número primo.");
			}
			else {
				int marcador = 1;
				for (int i = ((numero-1)/2); i >= 3; i = i-2) {
					int resto = numero % i;
					if (resto == 0) {
						marcador = 0;
						break;
					}
				}
				if (marcador == 0) {
					System.out.println("Não é um número primo.");
				} else {
					System.out.println("É um número primo");
				}
				
			}
				
		}

	}

}

