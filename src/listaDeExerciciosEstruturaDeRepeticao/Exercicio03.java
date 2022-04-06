package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número de cálculos: ");
		int N = leia.nextInt();
		int valorLido = 0;
		
		for (int leitura = 1; leitura <= N; leitura ++) {
			System.out.println("\nCálculo número " + leitura);
			System.out.print("Digite um número inteiro e positivo para o cálculo de fatorial: ");
			valorLido = leia.nextInt();
			System.out.println("Valor digitado \t Fatorial");
			System.out.print(valorLido + "\t\t ");
			
			int f = valorLido;
		
			while (valorLido
					> 1) {
				f = f * (valorLido - 1);
				valorLido--;
			}
			
			System.out.println(f);
		}
		
		System.out.println("\nFim dos cálculos");

	}

}
