package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio18Contador {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Digite a idade do(a) nadador(a): ");
		idade = leia.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Infantil B");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		} else if (idade >= 18) {
			System.out.println("S�nior");
		} else {
			System.out.println("Informe uma idade acima de 5 anos");
		}

	}

}
