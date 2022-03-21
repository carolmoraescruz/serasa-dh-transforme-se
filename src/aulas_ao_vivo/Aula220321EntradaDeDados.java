package aulas_ao_vivo;

import java.util.Scanner;

public class Aula220321EntradaDeDados {

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
