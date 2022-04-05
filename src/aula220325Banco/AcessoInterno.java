package aula220325Banco;

public interface AcessoInterno {
	
	// os m�todos n�o tem comportamento, s� assinatura
	
	/**
	 * 
	 * @param String usuario => pode-se informar um usu�rio v�lido
	 * @param String senha => pode-se informar uma senha com at� 255 caracteres alfanum�ricos
	 * @return retorna verdadeiro quando a senha est� correta
	 */
	public boolean autenticarSistema(String usuario, String senha);
	
	// m�todo para mudar usu�rio
	
	public boolean mudarUsuario(String novoUsuario);
	
	// m�todo para mudar senha
	
	public boolean alterarSenha(String senhaAntiga, String novaSenha);

}
