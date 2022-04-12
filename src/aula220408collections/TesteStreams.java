package aula220408collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStreams {

	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Maria");
		estudantes.add("Jos�");
		estudantes.add("Ant�nio");
		estudantes.add("Ruy");
		estudantes.add("Pedro");
		estudantes.add("Ana");
		
		// o stream cria uma sublista
		
		// Imprime todos os dados da lista
		System.out.println("Lista de alunos");
		estudantes.stream().forEach(System.out::println);
		
		System.out.println("================================");
		
		// Contador
		System.out.println("Total de estudantes da lista: " + estudantes.stream().count());
		
		// Saber qual o maior nome da lista
		System.out.println("Maior nome: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		// Saber qual o menor nome da lista
		System.out.println("Menor nome: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
		
		// Saber todos os nomes que cont�m a letra R
		System.out.println("Nomes que cont�m a letra R: " + estudantes.stream()
			.filter((estudante) -> estudante.toLowerCase().contains("r"))
			.collect(Collectors.toList()));
		
		// Exibe os n primeiros valores da collection
		System.out.println("Os primeiros 3 itens: " + estudantes.stream()
			.limit(3)
			.collect(Collectors.toList()));
		
		// Retorna um valor booleano de acordo com o crit�rio da busca - true se TODAS as palavras atenderem ao requisito
		System.out.println("Possui a letra q em todos os nomes? " + estudantes.stream()
			.allMatch((elemento) -> elemento.contains("q")));
		
		// Retorna um valor booleano de acordo com o crit�rio da busca - true se PELO MENOS UM
		System.out.println("Algu�m possui a letra a no nome? " + estudantes.stream()
			.anyMatch((elemento) -> elemento.contains("a")));
		
		// Retorna um valor booleano de acordo com o crit�rio da busca - true se NINGU�M atender ao requisito
		System.out.println("Ningu�m possui a letra w no nome? " + estudantes.stream()
			.noneMatch((elemento) -> elemento.contains("w")));
		
		// Retorna uma nova cole��o com o tamanho de cada nome
		System.out.println("Nova cole��o com tamanho" + estudantes.stream()
			.map((estudante) -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
			.collect(Collectors.toList()));
		
		
	}
	
}
