package br.com.geekuniversity.secao05;
/*1. Fa�a um programa que determine e mostre os cinco primeiros m�ltiplos de 3,
 *  considerando n�meros maiores que 0.
 */

public class Exercicio01 {
	public static void main(String[] args) {
		for(int i = 1; i <18; i++ ){
			
			if (i %3 == 0) {
				System.out.println(i + " � " + " multiplo de 3 ");
			}	
		}
		
	}
}
