package br.com.geekuniversity.secao03;

import java.util.Scanner;

/*
 * 2. Fa�a um programa que pe�a ao usu�rio para digitar tr�s
 * valores inteiros e imprima a soma deles.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros inteiros: ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		System.out.println("A soma dos numeros �: " + (num1 + num2 + num3));
		
		scanner.close();

	}

}
