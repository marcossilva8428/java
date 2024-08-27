package br.com.geekuniversity.secao08;
import java.util.Scanner;
/*
 * Criando nossas proprias funcoes
 * Faca um programa, que receba diversos nomes 
 * de frutas do usuario e no final imprima essas 
 * frutas em ordem contraria.
 * O programa deve solicitar ao usuario quantas 
 * frutas ele quer informar.
 */



public class Programa20 {
	// Declaracao do vetor
	static String fruta[];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int qtd;
		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(sc.nextLine());
		cadastrar_dados(qtd);
		mostrar_dados(qtd);
		sc.close();
	}
	/*
	 * Uma funcao deve ter o seguinte:
	 * a) Tipo de retorno;
	 * b) Nome - Corresponde a ação que a função realiza;
	 * c) Parametros/Argumentos de entrada (Opcional);
	 * d) Retorno (Opcional - depende do tipo do retorno);
	 */
	static void cadastrar_dados(int quantidade) {
		//	Definindo o tamanho do vetor
		
		fruta = new String[quantidade];
		for(int i = 0; i< quantidade; i++) {
			System.out.println("Informe a primeira " + (i +1) + " fruta: ");
			fruta[i] = sc.nextLine();
		}
	}
	
	static void mostrar_dados(int quantidade) {
		for(int i = quantidade; i > 0; i--) {
			quantidade--;
			System.out.println(fruta[quantidade]);
		}
	}
}
