package aula220404textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		
		// métodos são da classe Character
		
		// verificar se o valor é um número e retorna true ou false
		System.out.println("É um número?");
		System.out.println("5: " + Character.isDigit('5'));
		System.out.println("a: " + Character.isDigit('a'));
		
		System.out.println("==================================");
		
		// verificar se o valor é uma letra e retorna true ou false
		System.out.println("É uma letra?");
		System.out.println("f: " + Character.isLetter('f'));
		System.out.println("6: " + Character.isLetter('6'));
		
		System.out.println("==================================");
		
		// verificar se o valor é uma letra ou um número e retorna true ou false
		System.out.println("É uma letra ou número?");
		System.out.println("c: " + Character.isLetterOrDigit('c'));
		System.out.println("5: " + Character.isLetterOrDigit('5'));
		System.out.println("@: " + Character.isLetterOrDigit('@'));
		
		System.out.println("==================================");
		
		// verificar se o valor está escrito com letra maiúscula e retorna true ou false
		System.out.println("Está escrito com letra maiúscula?");
		System.out.println("c: " + Character.isUpperCase('c'));
		System.out.println("A: " + Character.isUpperCase('A'));
		
		System.out.println("==================================");
		
		// verificar se o valor está escrito com letra minúscula e retorna true ou false
		System.out.println("Está escrito com letra minúscula?");
		System.out.println("c: " + Character.isLowerCase('c'));
		System.out.println("A: " + Character.isLowerCase('A'));
		
		System.out.println("==================================");
		
		// verificar se o valor é um espaço em branco
		System.out.println("Está escrito um espaço em branco?");
		System.out.println(" : " + Character.isWhitespace(' '));
		
		
		System.out.println("==============Strings=============");
		
		
		// Strings
		
		// verifica valor antigo e substitui pelo novo
		String arquivo = "escola.java";
		System.out.println("Valor antigo: " + arquivo);
		arquivo = arquivo.replace("java", "class");
		System.out.println("Valor novo: " + arquivo);
		
		System.out.println("==================================");
		
		// compara dois valores
		String nome1 = "flavia";
		String nome2 = "Flavia";
		System.out.println("Valor 1: " + nome1);
		System.out.println("Valor 2: " + nome2);
		System.out.println("Valores são iguais? " + nome1.equals(nome2));
		
		// compara o conteúdo
		System.out.println("Conteúdo é igual? " + nome1.equalsIgnoreCase(nome2));
		
		// verifica se inicia exatamente com a mesma sequência de caracteres
		System.out.println("Valor 1 começa com 'fla'? " + nome1.startsWith("fla"));
		System.out.println("Valor 1 começa com 'Fla'? " + nome1.startsWith("Fla"));
		
		// verifica se finaliza exatamente com a mesma sequência de caracteres
		System.out.println("Valor 1 termina com 'ia'? " + nome1.endsWith("ia"));
		System.out.println("Valor 1 termina com 'fla'? " + nome1.endsWith("fla"));
		
		System.out.println("==================================");
		
		// compara as letras uma a uma
		// muito usado para colocar em ordem alfabética
		// collections
		System.out.println(nome1.compareTo(nome2));
		
		System.out.println("==================================");
		
		// verifica o tamanho da string
		System.out.println("Tamanho do valor 1: " + nome1.length());
		
		System.out.println("==================================");
		
		// verifica o valor armazenado num determinado índice
		System.out.println("Caractere 4: " + nome1.charAt(4));
		
		System.out.println("==================================");
		
		// retorna um pedaço da string (informar início e fim)
		System.out.println("Parte do texto caractere 2 a 4: " + nome1.substring(2, 5));
		
		System.out.println("==================================");
		
		// retorna a posição da 1ª ocorrência da letra
		System.out.println("Posição da primeira ocorrência da letra 'a' no valor 1: " + nome1.indexOf("a"));
		
		System.out.println("==================================");
		
		// retorna a posição da última ocorrência da letra
		System.out.println("Posição da última ocorrência da letra 'a' no valor 1: " + nome1.lastIndexOf("a"));
		
	}
}
