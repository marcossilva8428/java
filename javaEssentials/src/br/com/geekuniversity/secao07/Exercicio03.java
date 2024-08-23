package br.com.geekuniversity.secao07;

/*
 * 3. Escreva um programa que leita uma matriz 5 x 5 e um valor X. 
 * O programa deverá fazer uma busca desse valor na matriz e, ao final, 
 * escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.
 */

public class Exercicio03 {
	public static void main(String[] args) {
		int valorX = 35;
		Integer linha = null;
		Integer coluna = null;
		
		int matriz[][] = new int[5][5];
		
		matriz[0][0] = 1 ;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[0][4] = 5;
		
		matriz[1][0] = 6 ;
		matriz[1][1] = 7;
		matriz[1][2] = 8;
		matriz[1][3] = 9;
		matriz[1][4] = 10;
		
		matriz[2][0] = 11;
		matriz[2][1] = 12;
		matriz[2][2] = 13;
		matriz[2][3] = 14;
		matriz[2][4] = 15;
		
		matriz[3][0] = 35;
		matriz[3][1] = 17;
		matriz[3][2] = 18;
		matriz[3][3] = 19;
		matriz[3][4] = 20;
		
		matriz[4][0] = 21;
		matriz[4][1] = 22;
		matriz[4][2] = 23;
		matriz[4][3] = 24;
		matriz[4][4] = 25;
		
		
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == valorX) {
					linha = i;
					coluna = j;
			}
		}
		}
		
		if (linha != null){
			System.out.println("O valorX está na posição " + "[" + linha +"]" + "[" + coluna + "].");
		}else {
			System.out.println("valorX não encontrado.");
		}
		
		
	}
}
