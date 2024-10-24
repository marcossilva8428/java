package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();
	
	/**
	 * Em uma pilha, inserimos elementos sempre no topo.
	 * @param nome
	 * 
	 * Na implementacao do Java para pulhas (Stack) este metodo chama-se  push.
	 */
	public void insere(String nome) {
		this.nomes.add(nome);
	}
	
	/**
	 * Em uma pilha, removemos sempre o elemento que est� no topo.
	 * 
	 * Na implementacao do Java para pulhas (Stack) este metodo chama-se  pop.
	 * @return
	 */
	
	public String remove() {

		return nomes.remove(nomes.size() - 1);
	}
	
	public String pegaTopo() {
		return nomes.get(nomes.size() - 1);
	}
	
	public boolean vazia() {
		return nomes.size() == 0;
	}
	
	@Override
	public String toString() {
		
		return this.nomes.toString();
	}
}
