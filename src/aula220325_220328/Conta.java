package aula220325_220328;

public class Conta {
	// Atributos
		private int agencia;
		private int numeroConta;
		private double saldo;
		private String titular;
		
		
		//Construtoress
		public Conta() {
			
		}
		
		public Conta(int agencia, int numeroConta, String titular) {
			super();
			this.agencia = agencia;
			this.numeroConta = numeroConta;
			this.titular = titular;
			this.saldo = 0;
		}

		// métodos
		
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
		
		public String getTitular() {
			return titular;
		}
		
		public void setTitular(String titular) {
			this.titular = titular;
		}
}
