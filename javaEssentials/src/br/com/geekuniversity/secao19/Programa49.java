package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//	HashMap

/*
 A classe HashMap implementa a interface Map e trabalha com o conceito de chave/valor.
 
 */

public class Programa49 {
	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cl1 = new Cliente(8,"Jully Macanoel", "Rua 1");
		Cliente cl2 = new Cliente(3,"Rodolfo Macanoel", "Rua 2");
		
		Conta c1 = new Conta(1,200,300,cl1);
		Conta c2 = new Conta(1,200,300,cl2);
		
		contas.put("Pessoa Fisica", c1);
		contas.put("Pessoa Juridica", c2);
		
		System.out.println(contas.get("Pessoa Fisica"));
		
		
	}
}
