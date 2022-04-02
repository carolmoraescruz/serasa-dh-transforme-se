package aula220325Banco;

import java.time.LocalDate;

public abstract class Funcionario {
	
	private final double INDICE = 0.05; // final indica que o valor é uma constante
	private String nome;
	private String cpf;
	private String ctps;
	private LocalDate dataAdmissão;
	private double salario;	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String ctps, LocalDate dataAdmissão, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmissão = dataAdmissão;
		this.salario = salario;
	}
	
	/**
	 * Cálculo de bônus para todos os funcionários
	 * 
	 * @version 1.0
	 * @since 01/04/2022
	 * @author Caroline Moraes da Cruz
	 * @return valor calculado da bonificação
	 * 
	 */
	public double getBonus() {
		return this.salario * INDICE;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public LocalDate getDataAdmissão() {
		return dataAdmissão;
	}
	public void setDataContratação(LocalDate dataAdmissão) {
		this.dataAdmissão = dataAdmissão;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCTPS: " + getCtps() + "\nData de admissão: " + getDataAdmissão() + "\nSalário: " + getSalario();
	}

	
}
