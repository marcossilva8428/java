package br.com.geekuniversity.secao12;

public class Professor extends Pessoa{
	private String matricula;
	
	public Professor(String nome, int ano_nascimento, String email,String matricula) {
		super(nome, ano_nascimento, email);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//Overrinding // Sobre escrita de metodo
	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula;
	}
	
	//Overrinding // Sobre escrita de metodo
	public String getNome() {
		return "\nProfessor: \n" + super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
		
	}
		
}
