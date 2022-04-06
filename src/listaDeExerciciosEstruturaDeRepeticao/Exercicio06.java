package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numeroDeTermos;
		int X;
		int denominador = 1;
		int j = 1;
		double S = 0;
		
		System.out.print("Digite o número de termos: ");
		numeroDeTermos = leia.nextInt();
		System.out.print("Digite um valor inteiro e positivo para X: ");
		X = leia.nextInt();
		
		for (int i = 1; i <= numeroDeTermos; i++) {
			
			// Cálculo do sinal negativo/positivo 
			double sinal = Math.pow(-1, i);
			
			// Cálculo no numerador
			double numerador = Math.pow(X, (i+1));
			
			// Cálculo do incremento do denominador
			if (denominador >= 4) {
				j = -1;
			} else if (denominador <= 1) {
				j = 1;
			}
			
			// Cálculo do fatorial do denominador
			int f = denominador;
			int valorCalculo = denominador;
			
			while (valorCalculo > 1) {
				f = f * (valorCalculo - 1);
				valorCalculo--;
			}
			
			S = S + (sinal * numerador / f);
			
			denominador = denominador + j;
						
		}
		
		System.out.printf("S = %.0f", S);

	}

}
