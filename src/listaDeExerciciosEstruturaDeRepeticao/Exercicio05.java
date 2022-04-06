package listaDeExerciciosEstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numeroAluno[] = new int[10];
		int alturaAluno[] = new int[10];
		
		int posicaoAlunoBaixo = 0;
		int posicaoAlunoAlto = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Aluno " + (i+1));
			System.out.print("Digite o número do aluno: ");
			numeroAluno[i]= leia.nextInt();
			System.out.print("Digite a altura do aluno: ");
			alturaAluno[i] = leia.nextInt();
			System.out.print("\n==================================\n");
		}
		
		for (int i = 1; i < 10; i++) {
			if (alturaAluno[i] < alturaAluno[posicaoAlunoBaixo]) {
				posicaoAlunoBaixo = i;
			}
		}
		
		for (int i = 1; i < 10; i++) {
			if (alturaAluno[i] > alturaAluno[posicaoAlunoAlto]) {
				posicaoAlunoAlto = i;
			}
		}
		
		System.out.println("Aluno mais baixo: " + numeroAluno[posicaoAlunoBaixo]);
		System.out.println("Altura do aluno mais baixo: " + alturaAluno[posicaoAlunoBaixo]);
		System.out.println("\n");
		System.out.println("Aluno mais alto: " + numeroAluno[posicaoAlunoAlto]);
		System.out.println("Altura do aluno mais alto: " + alturaAluno[posicaoAlunoAlto]);

	}

}
