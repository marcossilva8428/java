package br.com.geekuniversity.secao21;
// Pilhas implementacao do java

import java.util.Stack;

public class Programa61 {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		
		System.out.println(nomes);
		nomes.push("Helena");
		nomes.push("Janaina");
		System.out.println(nomes + " push");
		
		String ret = nomes.peek();// Retorna o elemento do topo
		System.out.println(ret);
		System.out.println(nomes + " peek");
		
		String r1 = nomes.pop(); // remove
		System.out.println(r1);
		System.out.println(nomes + " remove");
		
		
	}

}
