package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio03Opcao02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de c�lculos: ");
		int N = leia.nextInt();
		int numeros[] = new int[N];
		int valorLido = 0;
		
		for (int leitura = 0; leitura < N; leitura++) {
			System.out.print("N�mero " + (leitura+1) + " para c�lculo do fatorial: ");
			numeros[leitura] = leia.nextInt();
		}
		
		System.out.println("\nValor digitado \t Fatorial");
		
		for (int i = 0; i < N; i ++) {
			valorLido = numeros[i];
			
			System.out.print(valorLido + "\t\t ");
			
			int f = valorLido;
		
			while (valorLido > 1) {
				f = f * (valorLido - 1);
				valorLido--;
			}
			
			System.out.println(f);
		}
		
		System.out.println("\nFim dos c�lculos");

	}

}
