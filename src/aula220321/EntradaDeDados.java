package aula220321;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		System.out.println("Informe um nome completo:");
		String nome = entradaDeDados.nextLine();
		
		System.out.println("Nome informado: " + nome);
		
		System.out.println("Informe sua idade:");
		int idade = entradaDeDados.nextInt();
		
		System.out.println("Idade informada: " + idade);
		
	}
}
