package aulas_ao_vivo;

// Notas de aula referentes ao dia 16/03/2022.

public class Aula220316 {

	public static void main(String[] args) {
		// While
		int contador = 0;

		while (contador < 10) {
			System.out.println("Número " + contador);
			// contador = contador + 2;
			contador += 2; // acumulador
		}

		System.out.println("\n===========================================\n");

		// Do While
		int contador2 = 0;

		do {
			System.out.println("Número " + contador2);
			contador2++;
		} while (contador2 <= 10);

		System.out.println("\n===========================================\n");

		for (int contador3 = 0; contador3 < 10; contador3++) {
			System.out.println("Valor " + contador3);
		}

	}

}
