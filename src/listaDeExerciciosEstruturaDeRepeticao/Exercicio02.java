package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		int N = leia.nextInt();
		int E = 0;
		
		while (N > 1) {
			int f = N;
			f = f * (N - 1);
			E = 1 + f;
			N--;
		}
		E = E + 2;
		
		System.out.println("E = " + E);
		
	}

}
