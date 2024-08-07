package br.com.geekuniversity.secao05;

/*2. Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes.
 *  A primeira vez, deve usar a estrutura de repetição for, a segunda while e a terceira do while.
 */

public class Exercicio02 {
	public static void main(String[] args) {
		int count = 1;
		int count2 = 1;
		
		System.out.println("FOR: ");
		for(int i = 1; i <101; i++ ) {
			System.out.println(i);
		}
		System.out.println("WHILE: ");
		while(count < 101) {
			System.out.println(count);
			count++;
			
		}
		System.out.println("DO WHILE: ");
		do{
			System.out.println(count2);
			count2++;
		}while(count2 < 101);
		
	}
}
