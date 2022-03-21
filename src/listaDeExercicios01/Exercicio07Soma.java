package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio07Soma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor1 = 0;
		int valor2 = 0;
		
		System.out.println("Digite o primeiro número inteiro: ");
		valor1 = leia.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		valor2 = leia.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("Soma: " + soma);

	}

}
