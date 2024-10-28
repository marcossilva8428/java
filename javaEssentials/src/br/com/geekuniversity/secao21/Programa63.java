package br.com.geekuniversity.secao21;
// Fila implementação do JAVA

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Helena"); // Inserir
		fila.add("Janaina");
		fila.add("Felicity");
		
		System.out.println(fila);
		
		String ret = fila.poll(); // Remover
		System.out.println(ret);
		System.out.println(fila);
		

	}

}
