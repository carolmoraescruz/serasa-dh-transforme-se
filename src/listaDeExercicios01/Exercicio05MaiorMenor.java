package listaDeExercicios01;

public class Exercicio05MaiorMenor {

	public static void main(String[] args) {
		int numero1 = 3;
		int numero2 = 6;
		int numero3 = 10;
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O n�mero maior �: " + numero1);
			if (numero2 < numero3) {
				System.out.println("O n�mero menor �: " + numero2);
			} else {
				System.out.println("O n�mero menor �: " + numero3);
			}
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O n�mero maior �: " + numero2);
			if (numero1 < numero3) {
				System.out.println("O n�mero menor �: " + numero1);
			} else {
				System.out.println("O n�mero menor �: " + numero3);
			}
		}
		
		else {
			System.out.println("O n�mero maior �: " + numero3);
			if (numero1 < numero2) {
				System.out.println("O n�mero menor �: " + numero1);
			} else {
				System.out.println("O n�mero menor �: " + numero2);
			}
		}

	}

}
