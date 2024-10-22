package br.com.geekuniversity.secao21;
//	Lista Ligada / LinkedList

/*
 * Em um vetor os elementos estao um do lado do outro enquanto em uma
 * lista ligada eles podem estar em lugares diferentes, porem um aponta para o
 * outro, indicando o proximo elemento.
 * 
 * [0][3][1][2][5][4][null]
 */

public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Helena");
		System.out.println(lista);
		lista.adiciona("Janaina");
		lista.adiciona("Marcos");
		System.out.println(lista);
		lista.removeDoComeco();
		System.out.println(lista);
		
	}

}
