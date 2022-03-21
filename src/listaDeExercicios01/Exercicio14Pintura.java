package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio14Pintura {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float largura = 0.00f;
		float altura = 0.00f;
		int tintaPorLata = 2;
		int consumoTinta = 3;
		
		System.out.print("Digite a largura da parede (em metros): ");
		largura = leia.nextFloat();
		System.out.print("Digite a altura da parede (em metros): ");
		altura = leia.nextFloat();
		
		float area = largura * altura;
		float numeroDeLatas = (area * consumoTinta) / tintaPorLata;
		int numeroDeLatasArred = (int)Math.ceil(numeroDeLatas);
		
		System.out.println("Número de latas necessárias: " + numeroDeLatasArred);

	}

}
