package br.com.geekuniversity.secao19;
//	Conjuntos

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Os consuntos sao implementados com a interface Set, e uma das
 * classes que implemetam esta interface é a HashSet
 * 
 * A maioria das colecoes possuem os mesmos metodos ja conhecidos
 * e utilizados com as listas, mas o comportamento desses objetos
 * é um pouco diferente.
 * 
 * A performance também é melhor em conjutnos do que em listas.
 * 
 * 
 * Caracteristicas dos conjuntos:
 * -Nao aceitam valores repetidos;
 * -A ordem de insercao nao eh respeitada (Realiza uma semi-ordenacao)
 	-Nao aceita ordenacao;
 	-Nao possui indice;
 */
public class Programa48 {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for(int i = 0; i < 5;i++) {
			System.out.println("Informe o " + (i+1) + "/5 nome: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O nome não pode ser repetido. ");
				i--;
			}
		}
		System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
	}
}
