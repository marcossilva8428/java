package br.com.geekuniversity.secao18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(new FileInputStream("arq.txt"));
			int totalLinha = 0;
			while(ler.hasNext()) {
				String linha = ler.nextLine();
				totalLinha +=1;
			}
			
			for(int i = 0;i != totalLinha; i++) {
				String linha = ler.nextLine();
				System.out.println(linha);
				//System.out.print(linha.charAt(i));
				
			}
			ler.close();
		}catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado.1 w");
		}
	}
}
