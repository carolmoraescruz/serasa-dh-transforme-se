package listaDeExercicios01;

import java.util.Scanner;

public class Exercicio10Compra {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigo = 0;
		String descricao;
		int quantidade = 0;
		double precoCompra = 0.00;
		float lucro = 0.00f;
		
		System.out.print("Digite o c�digo da mercadoria: ");
		codigo = leia.nextInt();
		System.out.print("Digite a descri��o da mercadoria: ");
		descricao = leia.next();
		System.out.print("Digite a quantidade de mercadorias: ");
		quantidade = leia.nextInt();
		System.out.print("Digite o pre�o de compra: ");
		precoCompra = leia.nextDouble();
		System.out.print("Digite o percentual de lucro: ");
		lucro = leia.nextFloat();
		
		double valorVenda = precoCompra + (precoCompra * lucro);
		double precoTotal = valorVenda * quantidade;
		
		System.out.println("Pre�o de compra: R$ " + String.format("%.2f", precoCompra));
		System.out.println("Percentual de lucro: " + String.format("%.2f", (lucro * 100)) + " %");
		System.out.println("Pre�o de venda: R$ " + String.format("%.2f", valorVenda));
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Pre�o total: R$ " + String.format("%.2f", precoTotal));

	}

}
