package br.com.geekuniversity.secao21;
//	Conjuntos

import java.util.LinkedList;

/*
 * Uma das caracteristicas dos conjuntos é a não aceitacao de elementos repetidos.
 * 
 * Gera performance
 * 
 * A = ["Angelina", "Angelo", "Adriano"...]
 * B = ["Bruna", "Barbara", "Benevides"...]
 * C = ["Carolina", "Cida", "Carlos"...]
 * D = ["Dedalo", "Drika", "Doca"...]
 * E = ["Estela", "Ester", "Eustaquio"...]
 * F = ["Fernanda", "Faro", "Farid"...]
 * .
 * .
 * .
 * Z = ["Zueleide", "Zuleica", "Zarzur"...]
 * 
 * 0   1  2  3  4  5
 * [h][e][l][e][n][a]
 */

public class Programa64 {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		System.out.println(conjunto);
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Julia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); // Não entra repetido
		
		conjunto.remove("Jovena");
		System.out.println(conjunto);
		
	}

}
