package aula220325Banco;

public class Conta {
	// Atributos
		private int agencia;
		private int numeroConta;
		protected double saldo;
		private PessoaHeranca titular;
		
		
		//Construtores
		public Conta() {
			
		}
		
		public Conta(int agencia, int numeroConta, PessoaHeranca titular) {
			super();
			this.agencia = agencia;
			this.numeroConta = numeroConta;
			this.titular = titular;
			this.saldo = 0;
		}

		// m�todos
		
		public void depositar(double valor) {
			if (valor > 0) {
				saldo += valor;
			}
		}
		
		public boolean sacar(double valor) {
			if (saldo >= valor && valor > 0) {
				saldo -= valor;
				return true;
			}
			return false;
		}
		
		public boolean transferir(double valor, Conta destinatario) {
			if (saldo >= valor && valor > 0) {
				saldo -= valor;
				destinatario.depositar(valor);
				return true;
			}
			return false;
		}


		// Getters & Setters
		public int getAgencia() {
			return agencia;
		}
		
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		public int getNumeroConta() {
			return numeroConta;
		}
		
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		public double getSaldo() {
			return saldo;
		}
		
		public PessoaHeranca getTitular() {
			return titular;
		}
		
		public void setTitular(PessoaHeranca titular) {
			this.titular = titular;
		}
}
