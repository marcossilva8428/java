package br.com.geekuniversity.secao21;

// Lista duplamente ligada

public class Programa59 {

	public static void main(String[] args) {
ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adiciona("Helena");
		System.out.println(lista);
		lista.adiciona("Janaina");
		System.out.println(lista);

		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.contem("Helena"));
	}

}
