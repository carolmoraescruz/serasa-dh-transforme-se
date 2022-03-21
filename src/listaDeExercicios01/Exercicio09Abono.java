package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio09Abono {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String departamento;
		double salario = 0.00;
		
		
		System.out.print("Digite o nome do(a) funcionário(a): ");
		nome = leia.next();
		System.out.print("Digite o departamento: ");
		departamento = leia.next();
		System.out.print("Digite o salário: ");
		salario = leia.nextDouble();
		
		double abono = salario * 0.1;
		double novoSalario = salario + abono;
		
		System.out.println("Valor do abono: R$ " + String.format("%.2f", abono));
		System.out.println("Valor do salário: R$ " + String.format("%.2f", novoSalario));

	}

}
