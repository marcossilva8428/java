package br.com.geekuniversity.secao09;

/*
 * 1. Crie uma classe para representar um contato, com os atributos privados de nome, email e
telefone. Crie os métodos públicos necessários para sets e gets e também um método para
imprimir os dados de uma pessoa. Crie também um programa, instancie um objeto desta classe
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
