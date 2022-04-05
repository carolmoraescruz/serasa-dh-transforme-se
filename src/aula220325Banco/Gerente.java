package aula220325Banco;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno {

	// mockado = já coloca um valor para teste
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, String ctps, LocalDate dataAdmissão, double salario) {
		super(nome, cpf, ctps, dataAdmissão, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getSalario() * 0.1;
	}

	@Override
	public boolean autenticarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean mudarUsuario(String novoUsuario) {
		if (!this.usuario.equals(novoUsuario) && usuario.length() == 12) {
			this.usuario = novoUsuario;
			return true;
		}
				return false;
	}

	@Override
	public boolean alterarSenha(String senhaAntiga, String novaSenha) {
		if (this.senha.equals(senhaAntiga) && senha.length() == 8) {
			this.senha = novaSenha;
			return true;
		}
		return false;
	}
	
}
