package br.com.geekuniversity.secao05;

import java.util.Scanner;

/*
 * 	While e do while
 *	Receba dados do usuário enquanto idade for > 0
 */

public class Programa08 {
public static void main(String[] args) {
		
		int idade ;
		String nome;
		
		//	Para receber dados do usuário via teclado
		Scanner sc = new Scanner(System.in);
		
		// Primeiro executa o bloco, depois faz a checagem
		do {
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Informe sua idade: ");
		//idade = sc.nextInt();// Bug
		idade = Integer.parseInt(sc.nextLine());
		
		if (idade > 0) {
			System.out.println(nome + " tem " + idade + " anos ");
		}
		
		
		}while (idade > 0);
		sc.close();
	}

}
