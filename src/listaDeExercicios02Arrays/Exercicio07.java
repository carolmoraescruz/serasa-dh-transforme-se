package listaDeExercicios02Arrays;

public class Exercicio07 {

	public static void main(String[] args) {
		int[] a = {1, 8, 7, 6, 4, 2, 8, 9, 3, 10};
		
		for (int i = 0; i < a.length; i++) {
			if ((a[i] % 2) == 0) {
				a[i] = 1;
			} else {
				a[i] = -1;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}

	}

}
