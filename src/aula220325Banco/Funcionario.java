package aula220325Banco;

import java.time.LocalDate;

public abstract class Funcionario {
	
	private final double INDICE = 0.05; // final indica que o valor � uma constante
	private String nome;
	private String cpf;
	private String ctps;
	private LocalDate dataAdmiss�o;
	private double salario;	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String ctps, LocalDate dataAdmiss�o, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmiss�o = dataAdmiss�o;
		this.salario = salario;
	}
	
	/**
	 * C�lculo de b�nus para todos os funcion�rios
	 * 
	 * @version 1.0
	 * @since 01/04/2022
	 * @author Caroline Moraes da Cruz
	 * @return valor calculado da bonifica��o
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
	public LocalDate getDataAdmiss�o() {
		return dataAdmiss�o;
	}
	public void setDataContrata��o(LocalDate dataAdmiss�o) {
		this.dataAdmiss�o = dataAdmiss�o;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nCTPS: " + getCtps() + "\nData de admiss�o: " + getDataAdmiss�o() + "\nSal�rio: " + getSalario();
	}

	
}
