package br.com.geekuniversity.secao08;

import java.util.Scanner;

/*
 * 1. Fa�a um programa que possua uma fun��o 
 * que recebe como par�metro um n�mero inteiro 
 * e devolve seu dobro.
 */

public class Exercicio01 {
	public static void main(String[] args) {
		int num1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero e o dobro dele ser� impresso :");
		num1 = sc.nextInt();
		
		System.out.println(dobro(num1));
	}
	
	static int dobro(int num1) {
		return num1 * 2;
	}
}
