package br.com.geekuniversity.secao04;
import java.util.Scanner;
/*
 * 3. Fa�a um programa que pe�a ao usu�rio para digitar um n�mero e diga se o n�mero digitado � par ou �mpar.
 */

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("O numero � par ");
		}else{
			System.out.println("O numero � impar");
		}
		
		sc.close();
	}
}
