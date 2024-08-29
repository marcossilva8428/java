package br.com.geekuniversity.secao09;

/*
 * 2. Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes
operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.
 */

public class Exercicio02 {
	public static void main(String[] args) {
		Agenda agenda1 = new Agenda();
		
		Contato contato1 = new Contato();
		contato1.setNome("Marcos Silva");
		contato1.setEmail("marcos@silva.com");
		contato1.setTelefone(115245847);
		
		Contato contato2 = new Contato();
		contato2.setNome("Marcos Jose");
		contato2.setEmail("marcos@jose.com");
		contato2.setTelefone(115245444);
		
		Contato contato3 = new Contato();
		contato3.setNome("Marcos Olavo");
		contato3.setEmail("marcos@olavo.com");
		contato3.setTelefone(1152488888);
		
		agenda1.armazenarContato(contato1);
		agenda1.armazenarContato(contato2);
		agenda1.armazenarContato(contato3);
		
		agenda1.imprimeAgenda();
		agenda1.imprimeContato(2);
		System.out.println(agenda1.buscaContato("Marcos Silva"));
		agenda1.removeContato(contato3);
		agenda1.imprimeAgenda();
	}
}
