package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Default Methods

/*
 * Default Methods -> S�o m�todos concretos implementados em 
 * interfaces. Estes m�todos, como s�o concretos, ou seja, j� possuem implementa��o,
 * n�o precisam ser implementados nas casses que implementarem esta interface.
 * 
 * Novidade implementada a partir da vers�o 8 do java
 * 
 * Atualmente estamos na vers�o 10 do Java.
 */

public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("Playstation 4");
		palavras.add("Outlast 2");
		
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		
		System.out.println(palavras);

	}

}
