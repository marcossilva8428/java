package br.com.geekuniversity.secao11;
//	Private

/*
 * Privado a propria classe.
 * 
 * Ou seja so temos acesso ao atributo ou metodo pivado
 * dentro da propria classe onde ele foi criado.
 */

public class Programa27 {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(49,"Marcelo Gouvea", "Rua dos Goitacazes, 57");
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Nome: " + cliente1.getEndereco());
		cliente1.dizer_oi();
		
		Cliente cliente2 = new Cliente (58,"Robson Loureiro","Rua Limao, 874");
		System.out.println("Nome: " + cliente2.getNome());
		System.out.println("Nome: " + cliente2.getEndereco());
		cliente2.dizer_oi();
	}	
}
