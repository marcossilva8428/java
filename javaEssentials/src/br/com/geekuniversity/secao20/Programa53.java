package br.com.geekuniversity.secao20;
//Thread não sincronizada (Não é estavel)
import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 * Por padrao as threads nao sao sincronizadas. Pode ocorrer problemas 
 * de uma thread acessar o valor de um objeto que ainda nao foi atualizado 
 * ou ainda as threads executarem depois do valor ja estar impresso.
 */

public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Marcos Silva", "Rua Lima");
		Conta c1 = new Conta(1, 200, 300, cli1); //	Saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(c1);

	}

}
