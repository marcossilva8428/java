package br.com.geekuniversity.secao21;
// Pilhas

/*
 * São estruturas de dados onde o elemento que está visivel/disponivel 
 * é o que está sempre no top.
 * 
 * os elementos ao serem adicionados em uma pilha, são adicionados sempre no topo
 * 
 * para remover elementos da pilha, só podemos remover o topo.
 * 
 *O ultimo elemento a entrar é o primeiro a sair.
 * 
 * [4] - > Tem visibilidade
 * [8]
 * [4]
 * [0]
 */

public class Programa60 {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		System.out.println(pilha);
		
		pilha.insere("Helena");		
		pilha.insere("Janaina");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);

		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		System.out.println(pilha.vazia());
			

	}

}
