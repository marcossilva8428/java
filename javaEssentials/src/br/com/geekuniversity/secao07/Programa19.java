package br.com.geekuniversity.secao07;
//	Matrizes parte 2

public class Programa19 {
	public static void main(String[] args) {
		
		int num[][] = new int [3][3];
		num[0][0] = 1;
		num[0][1] = 3;
		num[0][2] = 5;
		num[1][0] = 7;
		num[1][1] = 9;
		num[1][2] = 11;
		num[2][0] = 13;
		num[2][1] = 15;
		num[2][2] = 17;
		
//		System.out.println(num[1][2]);
		
		for(int i = 0; i < num.length; i++) {
			for(int j =0; j < num[i].length; j++) {
				//	System.out.println("num[" + i + "][" + j +"] = " + num[i][j]);
				num[i][j] = i + j * 2;
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j =0; j < num[i].length; j++) {
					System.out.println("num[" + i + "][" + j +"] = " + num[i][j]);
			}
		}
		
	}
}
