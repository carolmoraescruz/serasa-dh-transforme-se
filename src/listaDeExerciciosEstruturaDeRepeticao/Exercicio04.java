package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("\nPar " + (i+1));
			
			int numeros[] = new int[2];
			System.out.print("Digite o primeiro número: ");
			numeros[0] = leia.nextInt();
			System.out.print("Digite o segundo número: ");
			numeros[1] = leia.nextInt();
			
			System.out.println("\nNúmeros pares:");
			
			for (int j = numeros[0]; j <= numeros[1]; j++) {
				int resto = j % 2;
				if (resto == 0) {
					System.out.print(j + "\n");
				}
			
			}
						
		}
		
		System.out.println("\nFim dos cálculos");

	}

}
