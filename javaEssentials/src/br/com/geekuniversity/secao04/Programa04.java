//If, else, else if
package br.com.geekuniversity.secao04;

public class Programa04 {

	public static void main(String[] args) {
		// Declarando e inicializando a vari�vel
		int num1 = 5;
		
		if(num1 > 5) {
			System.out.println("Sim, o numero " + num1 +" � maior que 5.");
		}else if(num1 == 5) {
			System.out.println("N�o, o numero " + num1 +" � igual que 5.");
		}else if(num1 % 2 == 0) {
			System.out.println("O numero " + num1 +" � par.");
		}
		else {
			System.out.println("N�o, o numero " + num1 +" n�o � maior que 5.");
		}

	}

}
