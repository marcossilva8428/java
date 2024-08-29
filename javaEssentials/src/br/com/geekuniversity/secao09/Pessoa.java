package br.com.geekuniversity.secao09;
//	Classes
//	Atributos
//	Metrodos
//	Construtores

/*
 * Sempre, um construtor vazio tem a seguinte forma:
 * 
 */

public class Pessoa {
	
	String nome, email;
	int ano_nascimento;
	
	//	Construtor vazio
	public Pessoa() {}
	
	//	Construtor com parametros
	public Pessoa(String nome, String email, int ano_nascimento) {
		//	this == Este objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano de nascimento: " + this.ano_nascimento);
	}
	
}
