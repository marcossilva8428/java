package br.com.geekuniversity.secao20;
//	Simula��o da gera��o de relatotio + barra de tarefa
//	sem a utiliza��o de threads

public class Programa51 {

	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.executa();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.executa();

	}

}
