package br.com.geekuniversity.secao04;
import java.util.Scanner;

/*1. Fa�a um programa que pe�a ao usu�rio para 
 *  digitar dois n�meros e mostre qual deles � o maior.
 */

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira dois numeros inteiros :");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.println("O primeiro numero (" + num1 + " � o maior.");
		}else if(num2 > num1){
			System.out.println("O segundo numero (" + num2 + ") � o maior.");
		}else {
			System.out.println("Os dois numeros s�o iguais " + num1 + " = " + num2);
		}
		
		scanner.close();
	}

}
