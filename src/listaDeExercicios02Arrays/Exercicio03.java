package listaDeExercicios02Arrays;

public class Exercicio03 {

	public static void main(String[] args) {

		int[] numeros = {1, -8, 5, -7, -2, 3, 4, 9};
		int contador = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				contador++;
			}
		}
		System.out.println("Quantidade de números negativos: " + contador);
	}

}
