package br.com.geekuniversity.secao01;
import br.com.geekuniversity.secao11.Cliente;

/*
 * Publico - Pode ser utilizado em todo o projeto;
 */

public class Programa26 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cliente cliente1 = new Cliente(59,"Maria Joaquina","Rua das Alfazemas, 75");
		
//		System.out.println("Nome: " + cliente1.nome); //	private
//		System.out.println("Endereco: " + cliente1.endereco);//	private
//		cliente1.dizer_oi(); //Protected
	}

}
