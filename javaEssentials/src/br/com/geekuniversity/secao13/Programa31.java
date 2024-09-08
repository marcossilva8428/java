package br.com.geekuniversity.secao13;
// Clases abstratas

/*
 * E um recurso que proporciona um bloqueio na criação de objetos;
 * Nao conseguimos instanciar objetos de uma classe abstrata;
 */

import br.com.geekuniversity.secao12.Aluno;

public class Programa31 {

	public static void main(String[] args) {
		Aluno maria = new Aluno("Maria da Silva", 1999, "maria@dasilva.com", "1234");
		System.out.println(maria);
		
		maria.outra_mensagem("Meu nome é " + maria.getNome());

	}

}
