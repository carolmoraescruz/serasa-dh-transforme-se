package listaDeExercicios01;

public class Exercicio04Troco {

	public static void main(String[] args) {
		double valorMercadoria = 35;
		double valorPago = 50;
		
		double troco = valorPago - valorMercadoria;
		
		System.out.println("Troco: R$ " + String.format("%.2f", troco));

	}

}
