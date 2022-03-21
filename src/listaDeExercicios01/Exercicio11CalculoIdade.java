package listaDeExercicios01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicio11CalculoIdade {

	public static void main(String[] args) throws Exception {
		// AINDA NÃO ESTÁ FUNCIONANDO AAAAAAAAAAAAAAAAA
		
		Scanner leia = new Scanner(System.in);
		//DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-mm-dd");
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		TimeUnit time = TimeUnit.DAYS;
		
		String nome;
		String dataNascimento;
		String dataAtual;
		
		System.out.print("Digite o nome: ");
		nome = leia.next();
		System.out.print("Digite a data de nascimento: ");
		dataNascimento = leia.next();
		System.out.print("Digite a data de hoje: ");
		dataAtual = leia.next();
		
		Date dataNascimentoFormat = formato.parse(dataNascimento);
		Date dataAtualFormat = formato.parse(dataAtual);
		
		long diff = dataAtualFormat.getTime() - dataNascimentoFormat.getTime();
		long difference = time.convert(diff, TimeUnit.MILLISECONDS);
		long idade = difference / 365;
		
		//int idade = dataAtual - dataNascimentoFormat;
		
		System.out.println("Nome: " + nome);
		System.out.println("Data de Nascimento: " + dataNascimento);
		System.out.println("Data Atual: " + dataAtual);
		System.out.println("Data de Nascimento Formatada: " + dataNascimentoFormat);
		System.out.println("Data Atual Formatada: " + dataAtualFormat);
		System.out.println("Diferença: " + difference);
		System.out.println("Diferença: " + idade);
		//System.out.println("Idade: " + idade);
	}

}
