package listaDeExercicios01;

public class Exercicio03Desconto {

	public static void main(String[] args) {
		double valor = 50;
		float desconto = 0.15f;
		
		double total = valor - (valor * desconto);
		
		System.out.println("Valor total a ser pago: R$ " + String.format("%.2f", total));

	}

}
