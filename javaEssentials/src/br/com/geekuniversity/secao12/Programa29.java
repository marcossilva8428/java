package br.com.geekuniversity.secao12;

//	Sobrecarga de metodo

/*
 * Overloading 
 * Ocorre quando, sobrescrevemos um metodo na mesma classe de declacao;
 */

public class Programa29 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.mensagem();
		p1.mensagem("Minha mensagem � diferente...");
	}
}
