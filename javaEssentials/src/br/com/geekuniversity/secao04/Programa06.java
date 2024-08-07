package br.com.geekuniversity.secao04;
//	Instrução switch

public class Programa06 {
	public static void main(String[] args) {
		int num1 = 1548;
		
		switch (num1) {
			case 1:
				System.out.println("O número é 1");
				break;
			case 3:
				System.out.println("O número é 3");
				break;
			case 5:
				System.out.println("O número é 5");
				break;

			default:
			case 0:
				System.out.println("[Default] O número é " + num1);
				break;
		}
	}
}
