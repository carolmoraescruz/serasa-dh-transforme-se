package aula220325_a_220330;

public class ContaCorrente extends Conta {
	
	private double limite;
	private double saldoComLimite;
	
	public ContaCorrente() {
		this.limite = 500;
		this.saldoComLimite = super.saldo + limite;
	}
	
	@Override
	public boolean sacar(double valor) {
		if (saldo >= valor && valor > 0) {
			saldo -= valor;
			return true;
		} else if (valor <= saldoComLimite) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		if (saldo >= valor && valor > 0) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		} else if (valor <= saldoComLimite) {
			saldo -= valor;
			destinatario.depositar(valor);
			return true;
		}
		return false;
	}
	
	
	public double getLimite() {
		return this.limite;
	}
	
	public double getSaldoComLimite() {
		this.saldoComLimite = this.limite + super.saldo;
		return this.saldoComLimite;
	}

}
