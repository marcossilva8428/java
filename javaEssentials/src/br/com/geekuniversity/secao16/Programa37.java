package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa37 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Informe o primeiro numero para divisao: ");
	int num1 = sc.nextInt();
	
	System.out.println("Informe o segundo numero para divisao: ");
	int num2 = sc.nextInt();
	
	try {
		System.out.println("A divisao de " + num1 + " por " + num2 + " é " + num1 / num2);
	}catch(ArithmeticException e) {
		System.out.println("Nao é possivel dividir " + num1 + " por " + num2);
	}finally {
		System.out.println("Continua o processo...");
	}
	
	
	
	sc.close();
}
}
