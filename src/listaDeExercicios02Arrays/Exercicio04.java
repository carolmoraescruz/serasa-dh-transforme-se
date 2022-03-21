package listaDeExercicios02Arrays;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] a = {1, 5, 4, 1, 8, 9, 1, 6, 7, 1};
		int x = 1;
		int contador = 0;
		
		for(int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				contador++;
			}
		}
		System.out.print("Quantidade de x: " + contador);
	}
}
