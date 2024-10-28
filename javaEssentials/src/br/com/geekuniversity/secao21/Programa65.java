package br.com.geekuniversity.secao21;

import java.util.HashSet;
import java.util.Set;

// Implementacao de conjuntos do java

public class Programa65 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		System.out.println(nomes);
		
		nomes.add("Helena");
		nomes.add("Janaina");
		nomes.add("Marcos");
		
		System.out.println(nomes);
		
		String nome1 = "Helena";
		String nome2 = "Janaina";
		String nome3 = "Gabriela";
		
		System.out.println(nome1.hashCode());
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println("Helena".hashCode());
	}

}
