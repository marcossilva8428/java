package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o n1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Informe o n2: ");
		int n2 = sc.nextInt();
		
		try {
			System.out.println(divisao(n1,n2));
		}catch(Exception e) {
			System.out.println("Nao foi possivel executar a divisao");
		}
		
		
		sc.close();
	}
	
	//	Estou criando uma funcao, que avisa que tem possibilidade
	//de lancar uma excecao do tipo exception
	
	public static int divisao(int n1, int n2) throws Exception{
		return n1 / n2;
	}
}
