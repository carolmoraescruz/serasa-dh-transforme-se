package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio06Funcionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matricula;
		String nome;
		int idade;
		String sexo;
		String endereco;
		String bairro;
		String estadoCivil;
		
		System.out.println("Digite o número da matrícula: ");
		matricula = leia.nextInt();
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		System.out.println("Digite o sexo: ");
		sexo = leia.next();
		System.out.println("Digite o endereço: ");
		endereco = leia.next();
		System.out.println("Digite o bairro: ");
		bairro = leia.next();
		System.out.println("Digite o estado civil: ");
		estadoCivil = leia.next();
		
		System.out.println("Nome do(a) funcionário(a): " + nome);
		
	}

}
