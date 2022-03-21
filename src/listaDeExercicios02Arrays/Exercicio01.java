package listaDeExercicios02Arrays;

public class Exercicio01 {

	public static void main(String[] args) {
		
		System.out.println("letra a: \n");
		
		int[] numeros = new int[10];
		int valor = 10;
			
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = valor--;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("\nletra b: \n");
		
		int[] numeros2 = new int[11];
		int valor2 = 0;
			
		for(int i = 0; i < numeros2.length; i++) {
			numeros2[i] = valor2 * valor2;
			valor2++;
		}
		
		for(int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i]);
		}
		
		System.out.println("\nletra c: \n");
		
		int[] numeros3 = new int[10];
		int valor3 = 1;
		int valor4 = 10;
			
		for(int i = 0; i < 5; i++) {
			numeros3[i] = valor3++;
		}
		
		for(int i = 5; i < numeros3.length; i++) {
			numeros3[i] = valor4;
			valor4 = valor4 + 10;
		}
		
		for(int i = 0; i < numeros3.length; i++) {
			System.out.println(numeros3[i]);
		}
		
	}	
}