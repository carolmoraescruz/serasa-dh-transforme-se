package aula220325Banco;

public interface AcessoInterno {
	
	// os métodos não tem comportamento, só assinatura
	
	/**
	 * 
	 * @param String usuario => pode-se informar um usuário válido
	 * @param String senha => pode-se informar uma senha com até 255 caracteres alfanuméricos
	 * @return retorna verdadeiro quando a senha está correta
	 */
	public boolean autenticarSistema(String usuario, String senha);
	
	// método para mudar usuário
	
	public boolean mudarUsuario(String novoUsuario);
	
	// método para mudar senha
	
	public boolean alterarSenha(String senhaAntiga, String novaSenha);

}
