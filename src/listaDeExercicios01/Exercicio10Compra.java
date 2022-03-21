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
		
		System.out.print("Digite o código da mercadoria: ");
		codigo = leia.nextInt();
		System.out.print("Digite a descrição da mercadoria: ");
		descricao = leia.next();
		System.out.print("Digite a quantidade de mercadorias: ");
		quantidade = leia.nextInt();
		System.out.print("Digite o preço de compra: ");
		precoCompra = leia.nextDouble();
		System.out.print("Digite o percentual de lucro: ");
		lucro = leia.nextFloat();
		
		double valorVenda = precoCompra + (precoCompra * lucro);
		double precoTotal = valorVenda * quantidade;
		
		System.out.println("Preço de compra: R$ " + String.format("%.2f", precoCompra));
		System.out.println("Percentual de lucro: " + String.format("%.2f", (lucro * 100)) + " %");
		System.out.println("Preço de venda: R$ " + String.format("%.2f", valorVenda));
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));

	}

}
