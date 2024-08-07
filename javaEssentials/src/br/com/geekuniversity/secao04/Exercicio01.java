package br.com.geekuniversity.secao04;
import java.util.Scanner;

/*1. Faça um programa que peça ao usuário para 
 *  digitar dois números e mostre qual deles é o maior.
 */

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira dois numeros inteiros :");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro numero (" + num1 + " é o maior.");
		}else if(num2 > num1){
			System.out.println("O segundo numero (" + num2 + ") é o maior.");
		}else {
			System.out.println("Os dois numeros são iguais " + num1 + " = " + num2);
		}
		
		scanner.close();
	}

}
