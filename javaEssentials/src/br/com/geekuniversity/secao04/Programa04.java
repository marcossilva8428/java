//If, else, else if
package br.com.geekuniversity.secao04;

public class Programa04 {

	public static void main(String[] args) {
		// Declarando e inicializando a variável
		int num1 = 5;
		
		if(num1 > 5) {
			System.out.println("Sim, o numero " + num1 +" é maior que 5.");
		}else if(num1 == 5) {
			System.out.println("Não, o numero " + num1 +" é igual que 5.");
		}else if(num1 % 2 == 0) {
			System.out.println("O numero " + num1 +" é par.");
		}
		else {
			System.out.println("Não, o numero " + num1 +" não é maior que 5.");
		}

	}

}
