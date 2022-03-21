package listaDeExercicios01;

public class Exercicio01Conta {

	public static void main(String[] args) {
		double conta = 50.00;
		float percentual = 0.1f;
			
		double total = conta + (conta * percentual);
			
		System.out.println("Valor total da conta: R$ " + String.format("%.2f", total));


	}

}
