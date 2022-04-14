package listaDeExerciciosCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dicionarios02 {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 5, 5, 6, 7, 8, 8, 8);
		
		System.out.println(lista);
		
		Set<Integer> conjunto = new HashSet<>();
		
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(8);
		conjunto.add(8);
		
		System.out.println(conjunto);

		
	}
}
