package listaDeExerciciosEstruturaDeRepeticao;

public class Exercicio07 {

	public static void main(String[] args) {

		int fibonacci[] = new int[8];
		
		for (int i = 0; i < 8; i++) {
			if (i < 2) {
				fibonacci[i] = i;
			}
			else {
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
			}
		}
		
		for (int i = 0; i < 8 ; i++) {
			System.out.println(fibonacci[i]);
		}

	}

}
