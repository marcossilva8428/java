package br.com.geekuniversity.secao18;
//	Escrevendo em arquivos

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Programa42 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			//	Desta forma toda vez que o programa for executado,
			//	o arquivo sera recriado e toda a informacao , se pre-existe,
			//	sera excluida, recomecando um arquivo zerado.
		PrintStream escrever = new PrintStream("saida.txt");
		for(int i = 0; i <5; i++) {
			System.out.println("Escreva algo: ");
			String msg = teclado.nextLine();
			escrever.println(msg);
		}

		escrever.close();
		}catch(FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo");
		}
		
		teclado.close();

	}
}
