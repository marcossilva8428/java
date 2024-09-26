package br.com.geekuniversity.secao18;
/*
 * 2. Faça um programa que receba do usuário o nome de um arquivo texto e mostre na tela quantas linhas esse arquivo possui.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		try {
			System.out.println("Digite o nome do arquivo texto: ");
			Scanner sc = new Scanner(System.in);
			String nomeArquivo = sc.nextLine()+".txt";
			Scanner ler = new Scanner(new FileInputStream(nomeArquivo));
			System.out.println("Nome do arquivo: " + nomeArquivo);
			int totalLinha = 0;
			while(ler.hasNext()) {
				String linha = ler.nextLine();
				totalLinha +=1;
			}
			System.out.println("\nTotal de linhas :" + totalLinha);
			ler.close();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado.1 w");
		}
	}
}
