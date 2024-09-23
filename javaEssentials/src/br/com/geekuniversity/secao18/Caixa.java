package br.com.geekuniversity.secao18;
//	Caixa de objetos generios


public class Caixa {
	private Object[] objetos;
	private int posicaoLivre;
		
	public Caixa() {
		objetos = new Object[100]; //	At� 100 objetos, 0 a 99
	
	}
	
	public void adicionar(Object nova) {
		this.objetos[this.posicaoLivre] = nova;
		this.posicaoLivre++;
	}
	public Object pegar(int posicao) {
		return this.objetos[posicao];
	}
}
