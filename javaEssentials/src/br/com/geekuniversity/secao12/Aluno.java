package br.com.geekuniversity.secao12;
/*	Beneficios da heranca
 * Evita a repeticao de codigo;
 * Facilita a manutencao do programa;
 * 
 * Classe especifica;
 * Sub-classe
 * Classe filha
 * 
 */
//	Aluno é uma Pessoa

/*
 * Quando uma classe herda de outra classe ela ganha:
 * 	- TODOS os atributos e metodos da classe herdada
 */
public class Aluno extends Pessoa{
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email,String ra) {
		super(nome,ano_nascimento, email);
		// Pessoa(nome, ano_nascimento);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String toString() {
		return super.toString() + "\nR.A: " + this.ra;
	}
	
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}
}
