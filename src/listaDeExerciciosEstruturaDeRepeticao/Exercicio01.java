package listaDeExerciciosEstruturaDeRepeticao;

public class Exercicio01 {

	public static void main(String[] args) {

		double salarioInicial = 1000.00;
		double percentualAumento = 0.015;
		double salarioAtual = salarioInicial;
		double aumento = 0;
		
		for (int ano = 1996; ano <= 2022; ano++) {
			aumento = salarioAtual * percentualAumento;
			salarioAtual = salarioAtual + aumento;
			percentualAumento = percentualAumento * 2;
		}
		
		System.out.printf("Sal�rio atual: R$ %.2f", salarioAtual);
		System.out.printf("\n�ltimo aumento percentual: %.2f", percentualAumento * 100);
		System.out.printf("\n�ltimo aumento R$: %.2f", aumento);

	}

}
