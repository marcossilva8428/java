package br.com.geekuniversity.secao04;
import java.util.Scanner;

/*2. Fa�a um programa que pe�a ao usu�rio para digitar um n�mero. 
 * Se esse n�mero for positivo, calcule a raiz quadrada do n�mero. Se o n�mero for negativo, mostre uma mensagem dizendo que o n�mero � inv�lido.
 */
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		
		if (num1 > 0) {
			System.out.println("A raiz quadrada de " + num1 + " � " + num1 * num1);
		}else {
			System.out.println("Numero invalido");
		}
		sc.close();
	}
}
