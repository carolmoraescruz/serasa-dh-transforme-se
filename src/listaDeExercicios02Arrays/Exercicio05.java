package listaDeExercicios02Arrays;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] a = {4, -8, 6, 0, 1, 3, -7, -5};
		boolean[] b = new boolean[8];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				b[i] = true;
			}
			else {
				b[i] = false;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
	}

}
