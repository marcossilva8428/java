package br.com.geekuniversity.secao12;
/*
 * Classe base
 * Classe mae
 * Classe pai
 * Super classe
 * Classe generica
 */

public class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;
	
	public Pessoa() {}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	
	public void setAnoNascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	//Overrinding // Sobre escrita de metodo
	public String toString() {
		return "Nome: " + this.nome + "\nAno nascimento: "+ this.ano_nascimento;
	}
	//	Overloading / Sobrecarca de metodo
	public void mensagem() {
		System.out.println("Esta é minha mensagem...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
}
