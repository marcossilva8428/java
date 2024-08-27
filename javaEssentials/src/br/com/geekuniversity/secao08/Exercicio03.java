package br.com.geekuniversity.secao08;

import java.util.Scanner;

/*
 * 3. Escreva um programa que tenha uma função que recebe dois valores inteiros e retorna o maior.
 */

public class Exercicio03 {
	static int num1,num2,result;
	static String resp;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite primeiro numero");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Digite segundo numero");
		num2 = Integer.parseInt(sc.nextLine());
		
		result = maiorNum(num1,num2);
		if(result == 0) {
			System.out.println("Os numeros sao iguais");
		}else {
		System.out.println("O maior número é " + maiorNum(num1,num2));
			}
		}
	
	static int maiorNum(int num1,int num2) {
		if(num1 > num2) {
			return num1;
		}else if (num1 == num2) {
			return 0;
		}else {
			return num2;
		}
	}
	
	
}
