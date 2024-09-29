package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas

public class Programa46 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(421);
		numeros.add(3);
		numeros.add(1);
		numeros.add(89);
		numeros.add(17854);
		
		Collections.sort(numeros);
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}
}
