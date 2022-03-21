package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio11CalculoIdadeFlavia {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		int diaNascimento;
		int mesNascimento;
		int anoNascimento;
		
		int diaAtual;
		int mesAtual;
		int anoAtual;
		
		int idade;
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		
		System.out.print("Digite o dia de nascimento: ");
		diaNascimento = leia.nextInt();
		System.out.print("Digite o mês de nascimento: ");
		mesNascimento = leia.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.print("Digite o dia atual: ");
		diaAtual = leia.nextInt();
		System.out.print("Digite o mês atual: ");
		mesAtual = leia.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = leia.nextInt();
		
		if ((mesAtual > mesNascimento) || (mesAtual == mesNascimento && diaAtual >= diaNascimento)) {
			idade = anoAtual - anoNascimento;
		} else {
			idade = anoAtual - anoNascimento - 1;
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

	}

}
