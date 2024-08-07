package br.com.geekuniversity.secao04;
import java.util.Scanner;

/*2. Faça um programa que peça ao usuário para digitar um número. 
 * Se esse número for positivo, calcule a raiz quadrada do número. Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
 */
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		if (num1 > 0) {
			System.out.println("A raiz quadrada de " + num1 + " é " + num1 * num1);
		}else {
			System.out.println("Numero invalido");
		}
		sc.close();
	}
}
