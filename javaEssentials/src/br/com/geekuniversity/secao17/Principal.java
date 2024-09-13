package br.com.geekuniversity.secao17;

import java.util.Scanner;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 * Gerando executaveis jar
 * 
 * jar - java archive
 * 
 * Java Archive - arquivo compactado java
 * 
 * zip/rar 
 */

public class Principal {
	
	static Cliente cliente = new Cliente("Marcos Joaquim", "Rua das betoneiras, 501");
	static Conta conta = new Conta(1,200,300, cliente);
	static Scanner sc = new Scanner(System.in);
	
	

	
	public static void depositar() {
		System.out.println("========== Deposito ==========");
		System.out.println("Informe o valor para deposito: ");
		float valor = sc.nextFloat();
		if(valor > 0) {
			conta.depositar(valor);
			System.out.println("Deposito efetuado com sucesso.");
		}else {
			System.out.println("O valor precisa ser positivo");
		}
	}
	
	
	
	public static void sacar() {
		System.out.println("========== Saque ==========");
		System.out.println("Informe o valor para saque: ");
		float valor = sc.nextFloat();
		if(valor > 0) {
			conta.sacar(valor);
		}else {
			System.out.println("O valor precisa ser positivo");
		}
	}
	

	
	public static void consultar() {
		System.out.println("Seu saldo é " + conta.getSaldo());
	}
			
	public static void main(String[] args) {
		int opcao = 0;
		System.out.println("Bem vindo ao banco geek");
		
		do {
			System.out.println("Selecione uma opção abaixo: ");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				depositar();
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
			default:
				System.out.println("Opcao invalida.");
				break;
			}
			
		}while(opcao >0);
		sc.close();
	}
}
