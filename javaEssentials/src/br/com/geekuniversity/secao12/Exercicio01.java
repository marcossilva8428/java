package br.com.geekuniversity.secao12;
/*
 * 1. Escreva um código Java que tenha a classe Quadrado, com atributos lado, área e perímetro e
os métodos calcularArea, calcularPerimetro e imprimir. Adicione um método construtor que
permita a definição de todos os atributos no momento da instanciação do objeto. Crie um
programa para testar a classe. Para encontrar a área usamos a fórmula (lado * lado) e o
perímetro (4 * lado).
 */

public class Exercicio01 {
	public static void main(String[] args) {
		Quadrado quadrado1 = new Quadrado(19);
		quadrado1.calcularArea();
		quadrado1.calcularPerimetro();
		System.out.println(quadrado1);
	}
	
	
	
}
