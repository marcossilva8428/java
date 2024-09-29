package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * 1. Escreva um programa que:
a) Crie/abra um arquivo texto de nome “arq.txt”; OK
b) Permita que o usuário grave diversos caracteres nesse arquivo, até que o usuário entre com o caractere 0. OK
c) Feche o arquivo. OK
d) Abra e leia o arquivo, caractere por caractere, e escreve na tela todos os caracteres armazenados. OK
 */

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
		PrintStream escrever = new PrintStream(new FileOutputStream("arq.txt", true));
		String msg;
		for(int i = 1 ; i != 0; i++) {
			System.out.println("Escreva algo: ");
			msg = teclado.next();
			if (msg.equals("0")) {
				break;
			}
			escrever.println(msg);
		}
		escrever.close();
		}catch(FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo");
		}
		
		teclado.close();
		
		/*
		 * Lendo o arquivo , todos os caracteres linha por linha;
		 */
		
		try {
			Scanner ler = new Scanner(new FileInputStream("arq.txt"));
			while(ler.hasNext()) {
				String linha = ler.nextLine();
				System.out.println(linha);
			}
			ler.close();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado.1 w");
		}
		
		
	}
}
