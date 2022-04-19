package listaDeExerciciosDicionario04;

import java.util.ArrayList;
import java.util.List;

public class TesteGuardaVolumes {

	public static void main(String[] args) {
		
		Vestido vestidoDeBolinha = new Vestido();
		Vestido vestidoAzul = new Vestido();
		Vestido vestidoListrado = new Vestido();
		
		Camisa camisaAmarela = new Camisa();
		Camisa camisaVermelha = new Camisa();
		Camisa camisaAzul = new Camisa();
		
		List<Peca> vestidos = new ArrayList();
		vestidos.add(vestidoDeBolinha);
		vestidos.add(vestidoAzul);
		vestidos.add(vestidoListrado);
		
		List<Peca> camisas = new ArrayList();
		camisas.add(camisaAmarela);
		camisas.add(camisaVermelha);
		camisas.add(camisaAzul);
		
		GuardaVolumes volumes = new GuardaVolumes();
		
		volumes.guardarPecas(vestidos);
		volumes.guardarPecas(camisas);
		volumes.mostrarPecas();
		
		System.out.println("\n==================================================================\n");
		
		volumes.devolverPecas(1);
		volumes.mostrarPecas();
	}
}
