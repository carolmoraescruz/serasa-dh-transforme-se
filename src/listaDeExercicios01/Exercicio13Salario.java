package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio13Salario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double salarioBase = 0.00;
		int numeroDependentes = 0;
		
		System.out.print("Digite o sal�rio base: ");
		salarioBase = leia.nextDouble();
		System.out.print("Digite o n�mero de dependentes: ");
		numeroDependentes = leia.nextInt();
		
		double salarioBruto = salarioBase + (100 * numeroDependentes);
		double salarioLiquido = salarioBruto - (salarioBruto * 0.1);
		
		System.out.println("Sal�rio bruto: R$ " + String.format("%.2f", salarioBruto));
		System.out.println("Sal�rio l�quido: R$ " + String.format("%.2f", salarioLiquido));

	}

}
