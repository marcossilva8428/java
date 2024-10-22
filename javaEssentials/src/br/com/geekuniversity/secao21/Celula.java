package br.com.geekuniversity.secao21;
/**
 * Classe que representa uma celula (container) onde 
 * teremos o objeto (valor) e uma celula que sera a 
 * ligação para o proximo.
 * 
 * @author marcos.da.silva.j
 */

public class Celula {
	
	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	public Celula getProximo() {
		return this.proximo;
	}
	
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return this.elemento;
	}
}
