package aula220404textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		
		// m�todos s�o da classe Character
		
		// verificar se o valor � um n�mero e retorna true ou false
		System.out.println("� um n�mero?");
		System.out.println("5: " + Character.isDigit('5'));
		System.out.println("a: " + Character.isDigit('a'));
		
		System.out.println("==================================");
		
		// verificar se o valor � uma letra e retorna true ou false
		System.out.println("� uma letra?");
		System.out.println("f: " + Character.isLetter('f'));
		System.out.println("6: " + Character.isLetter('6'));
		
		System.out.println("==================================");
		
		// verificar se o valor � uma letra ou um n�mero e retorna true ou false
		System.out.println("� uma letra ou n�mero?");
		System.out.println("c: " + Character.isLetterOrDigit('c'));
		System.out.println("5: " + Character.isLetterOrDigit('5'));
		System.out.println("@: " + Character.isLetterOrDigit('@'));
		
		System.out.println("==================================");
		
		// verificar se o valor est� escrito com letra mai�scula e retorna true ou false
		System.out.println("Est� escrito com letra mai�scula?");
		System.out.println("c: " + Character.isUpperCase('c'));
		System.out.println("A: " + Character.isUpperCase('A'));
		
		System.out.println("==================================");
		
		// verificar se o valor est� escrito com letra min�scula e retorna true ou false
		System.out.println("Est� escrito com letra min�scula?");
		System.out.println("c: " + Character.isLowerCase('c'));
		System.out.println("A: " + Character.isLowerCase('A'));
		
		System.out.println("==================================");
		
		// verificar se o valor � um espa�o em branco
		System.out.println("Est� escrito um espa�o em branco?");
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
		System.out.println("Valores s�o iguais? " + nome1.equals(nome2));
		
		// compara o conte�do
		System.out.println("Conte�do � igual? " + nome1.equalsIgnoreCase(nome2));
		
		// verifica se inicia exatamente com a mesma sequ�ncia de caracteres
		System.out.println("Valor 1 come�a com 'fla'? " + nome1.startsWith("fla"));
		System.out.println("Valor 1 come�a com 'Fla'? " + nome1.startsWith("Fla"));
		
		// verifica se finaliza exatamente com a mesma sequ�ncia de caracteres
		System.out.println("Valor 1 termina com 'ia'? " + nome1.endsWith("ia"));
		System.out.println("Valor 1 termina com 'fla'? " + nome1.endsWith("fla"));
		
		System.out.println("==================================");
		
		// compara as letras uma a uma
		// muito usado para colocar em ordem alfab�tica
		// collections
		System.out.println(nome1.compareTo(nome2));
		
		System.out.println("==================================");
		
		// verifica o tamanho da string
		System.out.println("Tamanho do valor 1: " + nome1.length());
		
		System.out.println("==================================");
		
		// verifica o valor armazenado num determinado �ndice
		System.out.println("Caractere 4: " + nome1.charAt(4));
		
		System.out.println("==================================");
		
		// retorna um peda�o da string (informar in�cio e fim)
		System.out.println("Parte do texto caractere 2 a 4: " + nome1.substring(2, 5));
		
		System.out.println("==================================");
		
		// retorna a posi��o da 1� ocorr�ncia da letra
		System.out.println("Posi��o da primeira ocorr�ncia da letra 'a' no valor 1: " + nome1.indexOf("a"));
		
		System.out.println("==================================");
		
		// retorna a posi��o da �ltima ocorr�ncia da letra
		System.out.println("Posi��o da �ltima ocorr�ncia da letra 'a' no valor 1: " + nome1.lastIndexOf("a"));
		
	}
}
