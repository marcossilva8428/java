package br.com.geekuniversity.secao19;
//Listas

import java.util.ArrayList;
import java.util.Collections;

import br.com.geekuniversity.secao11.Cliente;

public class Programa47 {
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli0 = new Cliente(63,"Zuleide De Ferreira", "Rua Dos Eucalipitos 5");
		Cliente cli1 = new Cliente(8,"Jully Macanoel", "Rua Dos Cachorros 3");
		Cliente cli2 = new Cliente(3,"Rodolfo Macanoel", "Rua Dos Gatos 5");
		
		clientes.add(cli0);
		clientes.add(cli1);
		clientes.add(cli2);
		
		Collections.sort(clientes);
		
		for(Cliente cliente: clientes) {
			System.out.println(cliente);
		}
	}
}
