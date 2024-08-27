package br.com.geekuniversity.secao08;
/*
 * 2. Faça um programa que receba a data atual (dia, mês e ano) 
 * e exiba na tela no formato textual. 
 * Exemplo: Data 01/01/2024, Imprimir: 1 de janeiro de 2024.
 */

import java.util.Scanner;

public class Exercicio02 {
	static int dia,ano,mes;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Programa que recebe data atual: ");
		System.out.println();
		System.out.println("Digite o Dia ");
		dia = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o Mes ");
		mes = Integer.parseInt(sc.nextLine());
		System.out.println("Digite o Ano ");
		ano = Integer.parseInt(sc.nextLine());
		
		imprimeTextual(mes,ano);
		
	}
	
	static void imprimeTextual(int mes,int ano) {
		switch (mes) {
		case 1:
			System.out.println(mes + " de janeiro de " + ano);
			break;
		case 2:
			System.out.println(mes + " de fevereiro de " + ano);
			break;
		case 3:
			System.out.println(mes + " de marco de " + ano);
			break;
		case 4:
			System.out.println(mes + " de abril de " + ano);
			break;
		case 5:
			System.out.println(mes + " de maio de " + ano);
			break;
		case 6:
			System.out.println(mes + " de junho de " + ano);
			break;
		case 7:
			System.out.println(mes + " de julho de " + ano);
			break;
		case 8:
			System.out.println(mes + " de agosto de " + ano);
			break;
		case 9:
			System.out.println(mes + " de setembro de " + ano);
			break;
		case 10:
			System.out.println(mes + " de outubro de " + ano);
			break;
		case 11:
			System.out.println(mes + " de novembro de " + ano);
			break;
		case 12:
			System.out.println(mes + " de dezembro de " + ano);
			break;

		default:
		case 0:
			System.out.println("Data invalida");
			break;
	}
	}
}
