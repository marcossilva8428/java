package br.com.geekuniversity.secao07;
//	Vetores parte 2

public class Programa17 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i< numeros.length; i ++) {
			numeros[i] = i + 3;
		}
		System.out.println(numeros[0]);//	primeiro elemento
		System.out.println(numeros[9]);//	ultimo elemento
		
		/*
		 * Os vetores/arrays possuem tamanho fixo e
		 * nao podem ser aumentadoes/diminuidos
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]); // Primeiro elemento
		
		/*
		 * Os vetores/arrays possuem tipos de dados fixos
		 * e nao aceitam tipos variados.
		 * 
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]); //	Primeiro elemento
		System.out.println(numeros[9]); // 	Ultimo elemento
		
		//0..1 double
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		System.out.println(Math.round(Math.random() * 10));
		
		for(int i : numeros) {
			System.out.println(i);
		}
	}
}
