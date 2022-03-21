package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio16Aeroporto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float pesoBagagem = 0.00f;
		float pesoMaximo = 20.00f;
		double excessoDePeso = 0.00;
		
		System.out.print("Digite o peso da bagagem (em kg): ");
		pesoBagagem = leia.nextFloat();
		
		if (pesoBagagem <= 20) {
			excessoDePeso = 0.00;
		} else if (pesoBagagem > 20 && pesoBagagem <= 40) {
			excessoDePeso = (pesoBagagem - pesoMaximo) * 5000;
		} else {
			excessoDePeso = (pesoBagagem - pesoMaximo) * 10000;
		}

		System.out.println("Valor do excesso de peso: R$ " + String.format("%.2f", excessoDePeso));

	}

}
