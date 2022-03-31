package aula220325_a_220330;

public class TestaBanco {

	public static void main (String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //criar uma instância = cópia
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Profissão: " + pessoaNumero1.profissao);
//		System.out.println("CPF: " + pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("=================");
//		System.out.println("Nome: " + pessoaNumero1.nome);
//		System.out.println("Nome: " + pessoaNumero2.nome);
		
//		Aula220325Pessoa pessoaNova = new Aula220325Pessoa(); //instanciar a classe Pessoa
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println("Nome: " + pessoaNova.getNome());
//		System.out.println("===============================");
//		
//		Aula220325Pessoa pessoaComConstrutor1 = new Aula220325Pessoa("João dos Tomates", "259.800.966-55", "123.456-78");
//		System.out.println("Nome: " + pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
//		System.out.println("RG: " + pessoaComConstrutor1.getRg());

		
		PessoaFisica pfAna = new PessoaFisica();
		pfAna.setNome("Ana Banana");
		pfAna.setEmail("anabanana@gmail.com");
		pfAna.setTelefone("2165931566");
		pfAna.setCpf("879.359.983-88");
		pfAna.setProfissao("Professora");
		pfAna.setRg("12345984");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
//		conta1.setSaldo(100000.50); >> não se deve alterar manualmente essa informação, devendo ser apenas exibida.
		conta1.setTitular(pfAna);
		
		
		System.out.println("Agencia: " + conta1.getAgencia());
		System.out.println("Conta: " + conta1.getNumeroConta());
		System.out.printf("Saldo: R$ %.2f\n", conta1.getSaldo());
		System.out.println("Titular: " + conta1.getTitular().getNome());
		
		System.out.println("....................................................");
		
		conta1.depositar(10000);
		
		System.out.printf("Saldo atual: R$ %.2f\n", conta1.getSaldo());
		
		if(conta1.sacar(50)) {
			System.out.println("Saque efetuado com sucesso!");
		} else {
			System.out.println("Verifique o valor do saque!");
		}
		
		System.out.printf("Saldo atual: R$ %.2f\n", conta1.getSaldo());

		System.out.println("....................................................");
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(200, conta2);
		
		System.out.printf("Saldo atual conta 1: R$ %.2f\n", conta1.getSaldo());
		System.out.printf("Saldo atual conta 2: R$ %.2f\n", conta2.getSaldo());
		
		System.out.println("....................................................");
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.depositar(1000);
		System.out.printf("Saldo cc1: R$ %.2f\n", cc1.getSaldo());
		System.out.printf("Limite cc1: R$ %.2f\n", cc1.getLimite());
		System.out.printf("Total cc1: R$ %.2f\n", cc1.getSaldoComLimite());
		
		cc1.sacar(1100);
		System.out.printf("Saldo cc1: R$ %.2f\n", cc1.getSaldo());
		System.out.printf("Saldo com Limite cc1: R$ %.2f\n", cc1.getSaldoComLimite());
		
		
	}
}