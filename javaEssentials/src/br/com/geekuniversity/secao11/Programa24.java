package br.com.geekuniversity.secao11;
//	Encapsulamento
//	Capsula


public class Programa24 {
	public static void main(String[] args) {
		Cliente joao = new Cliente("Joao da silva", "Rua da paz, 45");
		Cliente maria = new Cliente("Maria da Silva", "Rua da paz, 45");
		
		Conta conta_joao = new Conta(1,100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2,300.0f,500.0f,maria);
		
		System.out.println("Saldo do Joao: " + conta_joao.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(150.00f);
		System.out.println("Saldo do Joao: " + conta_joao.getSaldo());
	}	
}
