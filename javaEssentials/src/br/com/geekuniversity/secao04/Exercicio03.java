package br.com.geekuniversity.secao04;
import java.util.Scanner;
/*
 * 3. Faça um programa que peça ao usuário para digitar um número e diga se o número digitado é par ou ímpar.
 */

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("O numero é par ");
		}else{
			System.out.println("O numero é impar");
		}
		
		sc.close();
	}
}
