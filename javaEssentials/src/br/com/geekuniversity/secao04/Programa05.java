package br.com.geekuniversity.secao04;
//	Operador ternário

// Se você precisar criar a função main() //programa java
//	main e no teclado pressionar CTRL + barra de espaço
public class Programa05 {
	
	public static void main(String[] args) {
		int num1 = 3, num2;
		/*
		if(num1 > 0) {
			num2 = num1;
		}else {
			num2 = 7;
		}*/
		num2 = (num1 > 0) ? num1 : 7;
		System.out.println(num2);
	}
}
