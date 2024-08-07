package br.com.geekuniversity.secao05;
/*3. Faça um programa que declara um valor inteiro, inicialize-o com 0,
 *  incremente-o de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).
 */

public class Exercicio03 {
	public static void main(String[] args) {
		int num1 = 0;
		
		do {
			num1 = num1 + 1000;
			System.out.println(num1);
		}while(num1 < 100000);
	}
}
