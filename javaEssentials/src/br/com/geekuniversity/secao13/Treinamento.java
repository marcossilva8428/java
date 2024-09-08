package br.com.geekuniversity.secao13;
//Template Method

/*
 * Final e um modificador de aceso que faz com que 
 * o elemento que esteja utilizando, nao possa ser extendido ou reescrito.
 * 
 */

public abstract  class Treinamento {
	
	//	Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	public final void treinoTatico() {
		System.out.println("Treino tatico...");
	}
}
