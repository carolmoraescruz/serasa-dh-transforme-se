package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio08Media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		float nota1 = 0.00f;
		float nota2 = 0.00f;
		float nota3 = 0.00f;
		
		System.out.println("Digite o nome do(a) aluno(a): ");
		nome = leia.next();
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextInt();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Média das notas: " + String.format("%.2f", media));

	}

}
