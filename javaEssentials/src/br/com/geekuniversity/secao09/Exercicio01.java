package br.com.geekuniversity.secao09;

/*
 * 1. Crie uma classe para representar um contato, com os atributos privados de nome, email e
telefone. Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um m�todo para
imprimir os dados de uma pessoa. Crie tamb�m um programa, instancie um objeto desta classe
e imprima os dados do objeto.

 */

public class Exercicio01 {
	public static void main(String[] args) {
		//Contato contato1 = new Contato("Janaina Marim", "janaina@marim.com",942445890);
		Contato contato1 = new Contato();
		contato1.setNome("Janaina Marim");
		contato1.setEmail("janaina@marim.com");
		contato1.setTelefone(942445874);
		contato1.imprime_contato();
	}
}
