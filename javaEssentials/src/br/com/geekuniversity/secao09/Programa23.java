package br.com.geekuniversity.secao09;
//	Construtor

/*
 * O construtor de uma classe sempre tem o mesmo nome da classe;
 * Por padrao, a JVM - Java virtual machine, cria em tempo de execucao 
 * um construtor padrao, um construtor vazio;
 * Podemos ter mais de um construtor na classe;
 * 
 */

public class Programa23 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); //	Metodo construtor
		
		pessoa1.nome = "Janaina Baldarenas";
		pessoa1.email = "janaina@baldarenas.com";
		pessoa1.ano_nascimento = 1983;
		
		pessoa1.imprime_informacoes();
		
		Pessoa pessoa2 = new Pessoa("Marcos Silva","marcos@silva.com",1984);
		
		pessoa2.imprime_informacoes();
	}
}
