package br.com.geekuniversity.secao05;
import java.util.Scanner;
/*
 * 	While e do while
 *	Receba dados do usuário enquanto idade for > 0
 */

public class Programa07 {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//	Para receber dados do usuário via teclado
		Scanner sc = new Scanner(System.in);
		
		while(idade > 0) {
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Informe sua idade: ");
		//idade = sc.nextInt();// Bug
		idade = Integer.parseInt(sc.nextLine());
		
		System.out.println(nome + " tem " + idade + " anos ");
		}
		sc.close();
	}

}
