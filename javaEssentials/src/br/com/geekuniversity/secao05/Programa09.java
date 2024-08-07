package br.com.geekuniversity.secao05;
//	for

import java.util.Scanner;

public class Programa09 {
	public static void main(String[] args) {
		
		int idade ;
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		//	variavel de controle; condição de parada; forma de incremento
		// i++ -> i = i + 1
		for(int i = 0; i <5; i++ ){
			
			System.out.println("Informe seu nome: ");
			nome = sc.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = sc.nextInt();// Bug
			idade = Integer.parseInt(sc.nextLine());
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos ");
			}	
		}

		sc.close();
	}
}
