package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o número de termos: ");
		int numeroTermos = leia.nextInt();
		
		int sequencia[] = new int[numeroTermos];
		
		int termosIniciais[] = {2, 7, 3};
		int num1 = termosIniciais[0];
		int num2 = termosIniciais[1];
		int num3 = termosIniciais[2];
		
		int i = 0;
		
		while (i < numeroTermos) {
			if (i < 3) {
				sequencia[i] = termosIniciais[i];
				i++;
			}
			else if (i < numeroTermos) {
				num1 = num1 * 2;
				sequencia[i] = num1;
				i++;
				
				if (i < numeroTermos) {
					num2 = num2 * 3;
					sequencia[i] = num2;
					i++;
					
					if (i < numeroTermos) {
						num3 = num3 * 4;
						sequencia[i] = num3;
						i++;
					}
					
				}
			}
		}
		
		for (int j = 0; j < numeroTermos ; j++) {
			System.out.println(sequencia[j]);
		}
		
		

	}

}

//Algoritmo "exercicio_2"
////Faça um programa que leia o número de termos, determine e mostre os
////valores de acordo com a série a seguir: SÉRIE = 2, 7, 3, 4, 21, 12,
////8, 63, 48, 16, 189, 192, 32, 567, 768, …
//

//enquanto(i<>num_termos)faça
//num1 <- (num1*2)
//escreval(num1)
//i <- (i+1)
//
//se (i<>num_termos) entao
//  num2 <- (num2*3)
//  escreval(num2)
//  i <- (i + 1)      
//  se (i<>num_termos) entao
//    num3 <- (num3*4)
//    escreval(num3)
//    i <- (i + 1)
//  fimse
//fimse      
//fimenquanto
//
//Fimalgoritmo