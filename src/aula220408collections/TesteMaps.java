package aula220408collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class TesteMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		
		// put => adicionar valores ao map
		quadroMedalhasOlimpicas2020.put("EUA", 113);
		quadroMedalhasOlimpicas2020.put("China", 88);
		quadroMedalhasOlimpicas2020.put("Jap�o", 58);
		quadroMedalhasOlimpicas2020.put("Gr�-Bretanha", 65);
		quadroMedalhasOlimpicas2020.put("Brasil", 21);
		
		// Buscar atrav�s de uma chave e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("Alemanha"));
		
		// Buscar atrav�s de um valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));
		
		// Informa o tamanho do map
		System.out.println(quadroMedalhasOlimpicas2020.size());
		
		// Consultar o valor atrav�s da chave
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		
		// Remover valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		for (Map.Entry<String, Integer> entry: quadroMedalhasOlimpicas2020.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println("===============================");
		System.out.println("Implementa��o de TreeMap");
		
		TreeMap<String, Integer> quadroMedalhasOlimpicas2016 = new TreeMap<>();
		
		// put => adicionar valores ao map
		quadroMedalhasOlimpicas2016.put("EUA", 103);
		quadroMedalhasOlimpicas2016.put("China", 90);
		quadroMedalhasOlimpicas2016.put("Jap�o", 50);
		quadroMedalhasOlimpicas2016.put("Gr�-Bretanha", 70);
		quadroMedalhasOlimpicas2016.put("Brasil", 17);
		
		System.out.println(quadroMedalhasOlimpicas2016.firstKey()); // pega a primeira chave
		System.out.println(quadroMedalhasOlimpicas2016.lastKey()); // pega a �ltima chave
		
		System.out.println(quadroMedalhasOlimpicas2016.lowerKey("China")); // mostra a chave anterior
		System.out.println(quadroMedalhasOlimpicas2016.higherKey("China")); // mostra a chave posterior
		
		System.out.println(quadroMedalhasOlimpicas2016.pollFirstEntry()); // exibe o valor e apaga posteriormente
		System.out.println(quadroMedalhasOlimpicas2016.pollLastEntry()); // exibe o valor e apaga posteriormente
		
		
	}
	
}
