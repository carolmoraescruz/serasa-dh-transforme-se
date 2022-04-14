package listaDeExerciciosCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Dicionarios01 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> numerosLoteriaDosSonhos = new HashMap<>();
		
		numerosLoteriaDosSonhos.put(0, "Ovos");
		numerosLoteriaDosSonhos.put(1, "Água");
		numerosLoteriaDosSonhos.put(2, "Escopeta");
		numerosLoteriaDosSonhos.put(3, "Cavalo");
		numerosLoteriaDosSonhos.put(4, "Dentista");
		numerosLoteriaDosSonhos.put(5, "Fogo");
		
		Map<String, List<String>> dicionarioApelidos = new HashMap<>();
		List<String> apelidosJoao = new ArrayList<>();
		List<String> apelidosMiguel = Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha");
		List<String> apelidosMaria = Arrays.asList("Wonder Woman", "Mary", "Marilene");
		List<String> apelidosLucas = Arrays.asList("Lukinha", "Jorge", "George");
		
		apelidosJoao.add("Juan");
		apelidosJoao.add("Fissura");
		apelidosJoao.add("Maromba");
		
		dicionarioApelidos.put("João", apelidosJoao);
		dicionarioApelidos.put("Miguel", apelidosMiguel);
		dicionarioApelidos.put("Maria", apelidosMaria);
		dicionarioApelidos.put("Lucas", apelidosLucas);
		
		for (Entry<String, List<String>> entry: dicionarioApelidos.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}
}
