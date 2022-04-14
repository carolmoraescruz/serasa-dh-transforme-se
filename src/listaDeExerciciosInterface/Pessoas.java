package listaDeExerciciosInterface;

import java.util.Objects;

public class Pessoas {

	private String nome;
	private int idade;
	
	public boolean equals(Object objetoPessoa) {
		if (this == objetoPessoa) return true;
		if (objetoPessoa == null || getClass() != objetoPessoa.getClass()) return false;
		
		Pessoas pessoa = (Pessoas) objetoPessoa;
		return Objects.equals(nome, pessoa.nome) &&
				Objects.equals(idade, pessoa.idade);
		
	}
	
}
