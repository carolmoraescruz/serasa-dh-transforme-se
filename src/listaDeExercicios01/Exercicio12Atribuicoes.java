package listaDeExercicios01;

public class Exercicio12Atribuicoes {

	public static void main(String[] args) {
		int A = 1;
		int B = 2;
		int C = 3;
		int auxiliar = 0;
		
		System.out.println("Antes da atribuição:");
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		System.out.println("C: " + C);
		System.out.println("\n===========================================\n");
		
		auxiliar = A;
		A = C;
		C = B;
		B = auxiliar;
		
		
		System.out.println("Depois da atribuição:");
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		System.out.println("C: " + C);

	}

}
