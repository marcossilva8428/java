package br.com.geekuniversity.secao20;
//Simula��o da gera��o de relatotio + barra de tarefa
//com a utiliza��o de threads

public class Programa52 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();

	}

}
