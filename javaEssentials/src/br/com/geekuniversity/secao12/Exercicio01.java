package br.com.geekuniversity.secao12;
/*
 * 1. Escreva um c�digo Java que tenha a classe Quadrado, com atributos lado, �rea e per�metro e
os m�todos calcularArea, calcularPerimetro e imprimir. Adicione um m�todo construtor que
permita a defini��o de todos os atributos no momento da instancia��o do objeto. Crie um
programa para testar a classe. Para encontrar a �rea usamos a f�rmula (lado * lado) e o
per�metro (4 * lado).
 */

public class Exercicio01 {
	public static void main(String[] args) {
		Quadrado quadrado1 = new Quadrado(19);
		quadrado1.calcularArea();
		quadrado1.calcularPerimetro();
		System.out.println(quadrado1);
	}
	
	
	
}
