package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//	Object: A mãe de todas as classes

/*
 * A classe object, faz parte do pacote java.lang
 */

public class Programa39 {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente(38,"Jefferson Queixudo","Rua França, 222");
		Cliente cli2 = new Cliente(35,"Michael Maos Pequenas","Rua Conta Gota, 47");
		Conta c1 = new Conta(1, 200,300,cli1);
		Conta c2 = new Conta(2,500,600,cli2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1); //	Por padrao a instancia imprime com toString()
		System.out.println(c2);
		
		if(c1.equals(cli1)) {
			System.out.println("Sao a mesma conta");
		}else {
			System.out.println("Sao contas diferentes");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());
		
		prateleira.adicionar(cli1);
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		
		if ((Object)cli1 instanceof Conta) {
			System.out.println("Objeto eh do tipo conta");
		}else {
			System.out.println("O Objeto nao eh do tipo conta");
		}
	}
}
