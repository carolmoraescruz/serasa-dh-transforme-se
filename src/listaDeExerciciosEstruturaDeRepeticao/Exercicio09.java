package listaDeExerciciosEstruturaDeRepeticao;

public class Exercicio09 {

	public static void main(String[] args) {

		int num = 0;
		
		for (int i = 1; i <= 50; i++) {
			if ((i % 2) == 0) {
				num = num + i;		
			}
		}
		
		System.out.println("Soma = " + num);

	}

}
