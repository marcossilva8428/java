package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero real: ");
		float num1 = Float.parseFloat(scanner.nextLine());
		System.out.println("O quadrado de " + (num1) + " é " + (Math.pow(num1, 2)));
		
		scanner.close();
	}

}
