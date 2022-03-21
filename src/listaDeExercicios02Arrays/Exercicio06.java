package listaDeExercicios02Arrays;

public class Exercicio06 {

	public static void main(String[] args) {
		int[] a = {1, 5, 9, 4, 3 , 7, 8, 11, 2, 4};
		int posicao = 0;
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[posicao]) {
				posicao = i;
			}
		}
		
		System.out.print("Posição do maior número: " + posicao);

	}

}
