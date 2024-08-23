package br.com.geekuniversity.secao07;
/*
 * 2. Faça um programa que leia uma matriz 4 x 4, 
 * conte e escreva quantos valores maiores que 10 ela possui.
 */

public class Exercicio02 {
	public static void main(String[] args) {

		int matriz[][] = new int[4][4];
		int contagem = 0;
		
		matriz[0][0] = 13 ;
		matriz[0][1] = 3;
		matriz[0][2] = -5;
		matriz[0][3] = 4;
		
		matriz[1][0] = 45;
		matriz[1][1] = 7;
		matriz[1][2] = 9;
		matriz[1][3] = 3;
		
		matriz[2][0] = 23;
		matriz[2][1] = 14;
		matriz[2][2] = 2;
		matriz[2][3] = 1;
		
		for(int i =0; i< matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > 10) {
					contagem++;
				}
				
			}
		}
		System.out.println("A matriz possue " + contagem + " numeros maiores que 10");
	}
}
