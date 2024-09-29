package br.com.geekuniversity.secao19;
import java.util.ArrayList;
/*
 * Arrays (Vetores/Matrizes)
 * 
 * - Um array tem tamanho fixo.Ou seja, se criarmos um array com 5
 * elementos ele tera sempre no maximo 5 elementos
 * 
 * - Um array tem tipo de dados fixo. Ou seja, se criarmos um array de inteiros
 * ele só podera ter inteiros.
 * 
 * - É dificil encontrar um determinado elemento em um array.. Precisamos para isso
 * varrer todo o array atraves do seu indice, caso nao facamos busca pelo indice.
/*
 * Colections (Colecoes)
 * 
 * - Java possui diversas classes/interfaces que facilitam muito o trabalho quando 
 * se trata de colecaoes de dados. Essas clasesses/interfaces sao chamadas de Collections(Colecoes)
 * 
 */
import java.util.Collections;

/*
 * Listas
 * 
 * 	-Aceitam repeticao de valores;
 * 	-Possuem tamanho 'infinito' (Depende da memória)
 * 	-Podemos adicionar valores de qualquer tipo, desde que
 */

public class Programa45 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Jully");
		nomes.add("Rodolfo");
		nomes.add("Chico");
		nomes.add("Maria");
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
//		System.out.println(nomes.size());
//		for(int i = 0; i < nomes.size();i++) {
//			System.out.println(nomes.get(i));
//		}
		
		Collections.sort(nomes);
		for(Object nome : nomes) {
			System.out.println(nome);
		}
		
	}
}
