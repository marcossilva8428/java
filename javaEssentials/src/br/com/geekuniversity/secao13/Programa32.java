package br.com.geekuniversity.secao13;
//	Template Method

/*
 * O padrao tempate method define o esqueleto de um algoritimo  dentro de um metodo
 * transferindo alguns de seus passos para as subclasses. O template Method permite
 * que as subclasses redefinam certos passos de um algoritmo  sem alterar a estrutura
 * do proprio algoritmo.
 * 
 * Algoritmos sao  "receitas" passo a passo para resolver algum problema.
 * 
 */

public class Programa32 {
	public static void main(String[] args) {
		TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();
		tit.treinoDiario();
		
		TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();
		tft.treinoDiario();
	}
}
