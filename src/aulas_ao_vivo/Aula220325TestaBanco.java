package aulas_ao_vivo;

public class Aula220325TestaBanco {

	public static void main (String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //criar uma inst�ncia = c�pia
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profiss�o: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "Jo�o dos Tomates";
//		System.out.println("=================");
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Nome: " + pessoaNumero2.nome);
		
		Aula220325Pessoa pessoaNova = new Aula220325Pessoa(); //instanciar a classe Pessoa
		pessoaNova.setNome("Jose das Couves");
		System.out.println("Nome: " + pessoaNova.getNome());
		System.out.println("===============================");
		
		Aula220325Pessoa pessoaComConstrutor1 = new Aula220325Pessoa("Jo�o dos Tomates", "259.800.966-55", "123.456-78");
		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
		System.out.println("RG: " + pessoaComConstrutor1.getRg());
	}
}