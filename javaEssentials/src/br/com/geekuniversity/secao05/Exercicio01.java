package br.com.geekuniversity.secao05;
/*1. Faça um programa que determine e mostre os cinco primeiros múltiplos de 3,
 *  considerando números maiores que 0.
 */

public class Exercicio01 {
	public static void main(String[] args) {
		for(int i = 1; i <18; i++ ){
			
			if (i %3 == 0) {
				System.out.println(i + " é " + " multiplo de 3 ");
			}	
		}
		
	}
}
