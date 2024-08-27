package br.com.geekuniversity.secao08;

import java.util.Scanner;

/*
 * 1. Faça um programa que possua uma função 
 * que recebe como parâmetro um número inteiro 
 * e devolve seu dobro.
 */

public class Exercicio01 {
	public static void main(String[] args) {
		int num1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero e o dobro dele será impresso :");
		num1 = sc.nextInt();
		
		System.out.println(dobro(num1));
	}
	
	static int dobro(int num1) {
		return num1 * 2;
	}
}
