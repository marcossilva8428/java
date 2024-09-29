package br.com.geekuniversity.secao18;

/*
 * 3. Faça um programa que receba do usuário o nome de um arquivo texto e mostre na tela quantas letras são vogais e quantas são consoantes.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercicio03 {
	public static void main(String[] args) {	
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo de texto para contar quantas consoantes e vogais ele possui: ");
			String nomeArquivo = teclado.next();
			Scanner ler = new Scanner(new FileInputStream(nomeArquivo+".txt"));
			int totalVogal = 0;
			int totalConsoante = 0;
			while(ler.hasNext()) {
				String linha = ler.nextLine();
				for(int i = 0; i < linha.length();i++) {
					char vogal = linha.charAt(i);
					String a = String.valueOf(vogal);
					switch(a) {
						case "a":
						case "e":	
						case "i":
						case "o":
						case "u":
						totalVogal +=1;
						break;
					default:
						totalConsoante +=1;
					}		
				}
				}
			System.out.println("Total de Vogais: " + totalVogal);
			System.out.println("Total de Consoantes: " + totalConsoante);
			
			teclado.close();
			ler.close();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado.1 w");
		}
	}
}
