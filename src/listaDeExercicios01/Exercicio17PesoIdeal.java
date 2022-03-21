package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio17PesoIdeal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String sexo;
		float altura = 0.00f;
		double pesoIdeal = 0.00f;
		
		System.out.print("Digite 'M' para sexo masculino e 'F' para sexo feminino: ");
		sexo = leia.next();
		
		switch(sexo) {
			case("M"):
				System.out.print("Digite sua altura (em m): ");
				altura = leia.nextFloat();
				pesoIdeal = ((72.7 * altura) - 58);
				System.out.println("Seu peso ideal é: " + String.format("%.2f", pesoIdeal) + " kg");
			break;
			case("F"):
				System.out.print("Digite sua altura (em m): ");
				altura = leia.nextFloat();
				pesoIdeal = ((62.1 * altura) - 44.7);
				System.out.println("Seu peso ideal é: " + String.format("%.2f", pesoIdeal) + " kg");
			break;
			default:
				System.out.println("Opção inválida");
			break;
		}

	}

}
