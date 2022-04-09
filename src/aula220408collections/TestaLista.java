package aula220408collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {
	
	public static void main(String[] args) {
		
		List<Carro> meusCarros = new ArrayList<>();
		
		Carro carro1 = new Carro("Audi X1", 2022, "Prata", "2.2");
		
		meusCarros.add(carro1); // inserir informação
		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Renegade", 2018, "Preto", "2.0"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		meusCarros.add(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		
		for (Carro carro : meusCarros) {
			System.out.println(carro.toString() + "\n");
		}
		
		System.out.println("==========================================\n");
		
		for (int i = 0; i < meusCarros.size(); i++) {
			Carro carroTemp = meusCarros.get(i);
			System.out.println(carroTemp.toString() + "\n");
		}
		
		System.out.println("==========================================\n");
		
		System.out.println(meusCarros.get(1).toString());
		
		System.out.println("==========================================\n");
		
		// meusCarros.remove(2);
		
		for (Carro carro : meusCarros) {
			System.out.println(carro.toString() + "\n");
		}
		
		System.out.println("==========================================\n");
		
		// boolean resp = meusCarros.contains(carro1) - não é muito usada por não ficar criando muito atributo
		boolean resp = meusCarros.contains(new Carro("Etios Sedan", 2019, "Vermelho", "1.6"));
		System.out.println(resp + "\n");
		
		System.out.println("==========================================\n");
		
		// sort() => Comparable => trabalhando com Strings
		Collections.sort(meusCarros);
		System.out.println(meusCarros.toString());
		
		System.out.println("==========================================\n");
		
		meusCarros.sort(new ComparadorDeAnos());
		System.out.println(meusCarros.toString());
		
		System.out.println("==========================================\n");
		
		// colocar em ordem aleatória
		Collections.shuffle(meusCarros);
		System.out.println(meusCarros.toString());
				
		
	}

}
