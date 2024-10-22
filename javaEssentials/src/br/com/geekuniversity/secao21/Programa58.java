package br.com.geekuniversity.secao21;
//	LinkedList

import java.util.LinkedList;
import java.util.List;

public class Programa58 {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		System.out.println(lista.size());
		
		lista.add("Helena");
		lista.add("Janaina");
		lista.add("Marcos");
		
		lista.add(0,"Lourdes");
		
		System.out.println(lista);
		

	}

}
