package br.com.geekuniversity.secao20;
//	Thread sincronizada

/*
 * O sincronismo ocorre pois durante a execução do metodo a thread
 * executa um 'lock' (bloqueio) da funcao para que a outra thread
 * so possa executa-la apos a finalizacao da thread inicial.
 */

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Marcos Silva", "Rua Lima");
		Conta c1 = new Conta(1, 200, 300, cli1); //	Saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		t1.join(); //	Avisando que a thread t1 deve 'se juntar' a um sincronizador
		t2.join();//	Avisando que a thread t2 deve 'se juntar' a um sincronizador
		
		System.out.println(c1);

	}

}
