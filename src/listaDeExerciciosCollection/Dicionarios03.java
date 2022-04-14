package listaDeExerciciosCollection;

import java.util.HashSet;
import java.util.Set;

public class Dicionarios03 {

	public static void main(String[] args) {
		
		Set<Integer> conjuntoDeInteiros = new HashSet<>();
		
		conjuntoDeInteiros.add(10);
		conjuntoDeInteiros.add(15);
		conjuntoDeInteiros.add(7);
		conjuntoDeInteiros.add(5);
		
		int somaTotal = 0;
		
		for (Integer integer : conjuntoDeInteiros) {
			somaTotal = somaTotal + integer;
		}
		
		System.out.println("Soma total: " + somaTotal);
		System.out.println(conjuntoDeInteiros);
		
	}
	
}
