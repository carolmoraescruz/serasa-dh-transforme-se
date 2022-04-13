package listaDeExerciciosInterface;

public class Jogador {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador();
		
		Pistola pistola = new Pistola();
		pistola.atirar(6);
		pistola.recarregar(60);
		
		ArcoEFlecha arco = new ArcoEFlecha();
		arco.atirar(1);
		arco.recarregar(15);
		
	}
}
