package br.com.geekuniversity.secao06;
//	Operacoes matematicas

public class Programa15 {
	public static void main(String[] args) {
		int num1 = 5, num2 = 10, res;
		float res2;
		
		//	Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " � " + res);
	
		//	Soma
		res = num1 - num2;
		System.out.println("A subtracao de " + num1 + " - " + num2 + " � " + res);
	
		//	Multiplica��o
		res = num1 * num2;
		System.out.println("A multiplicacao de " + num1 + " * " + num2 + " � " + res);
	
	
		//	Divisao (inteira)
		res = num2 / num1;
		System.out.println("A divisao de " + num2 + " + " + num1 + " � " + res);
	
		//	Divisao (real)
		res2 = (float)num2 / (float)num1; //cast
		System.out.println("A soma de " + num1 + " + " + num2 + " � " + res2);
	
		//	Modulo 
		/*
		 * Se o resto do modulo da variavel por 2 for 0, a variavel 
		 *� par. Se o resto for 1, a variavel � impar.
		 */
		res = num1 % 2;
		System.out.println("O resta da divisao de " + num1 + " por 2 � " + res);
		
		res = num2 % 3;
		System.out.println(num2 + " � divisivel por 3? " + res);
	}
}
