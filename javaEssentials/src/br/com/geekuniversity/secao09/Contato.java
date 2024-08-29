package br.com.geekuniversity.secao09;

public class Contato {
	private String nome;
	private String email;
	private int telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public Contato() {}
	
	public Contato(String nome, String email, int telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	void imprime_contato() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Email: "+ this.email);
		System.out.println("Telefone: "+ this.telefone);
	}
	
}
