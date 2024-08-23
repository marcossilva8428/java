package br.com.geekuniversity.secao07;

//	Matrizes

/*
 * Vetores/arrays/matrizes multi-dimenssionais
 * 
 * Vetor
 * int num[3];
 * num[0] = 3;
 * num[1] = 2;
 * num[2] = 5;
 * 
 *Matriz
 *[Linhas][Colunas]
 *int num[3][3]
 *
 *num[0][0] = 1;
 *num[0][1] = 2;
 *num[0][2] = 5;
 *num[1][0] = 7;
 *num[1][1] = 4;
 *num[1][2] = 9;
 *num[2][0] = 3;
 *num[2][1] = 6;
 *num[2][2] = 32;
 */

public class Programa18 {
	public static void main(String[] args) {
		//	Declaracao
		int num2[][];
		
		
		//	Declaracao e definicao de tamanho
		int num[][] = new int[3][3];
		
		//	Declarar, definir o tamanho e inicializar
		int num3[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//	Declarar uma matriz informando somente as linhas
		int num4[][] = new int[2][];
		num4[0] = new int[5];
		num4[1] = new int[3];
		
		int num5[][] = {{1,2},{4,5,6,7,8},{9,10,11}};
		
		System.out.println(num5[0]);
	}
}
