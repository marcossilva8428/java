package br.com.geekuniversity.secao12;

/*
 * 2. Escreva um código Java que apresente a classe Moto, com atributos marca, modelo, cor e
marcha e os métodos imprimir e trocarMarcha. 
O método imprimir deve mostrar na tela os valores de todos os atributos. 


O método trocarMarcha deverá aumentar ou diminuir a marca de acordo com um valor informado. 

O atributo marcha indica em que marcha a Moto encontra-se no momento, sendo representado de forma inteira, 
onde 0 – neutro, 1 – primeira, 2 – segunda, etc.

Adicione um método construtor que permita a definição de todos os atributos no momento da
instanciação do objeto.

Crie um construtor para a classe permitindo a definição de todos os
atributos.
 */

public class Execicio02 {

	public static void main(String[] args) {
		Moto moto1 = new Moto("mafra","cc3","laranjaFux");
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.subir_marcha();
		System.out.println(moto1);
		moto1.descer_marcha();
		System.out.println(moto1);
		moto1.descer_marcha();
		System.out.println(moto1);
		moto1.descer_marcha();
		System.out.println(moto1);
		moto1.descer_marcha();
		System.out.println(moto1);
		moto1.descer_marcha();
		System.out.println(moto1);

		
		
	}

}
