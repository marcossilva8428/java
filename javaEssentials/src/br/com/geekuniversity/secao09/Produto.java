package br.com.geekuniversity.secao09;

//	Classes
/*
 * O nome das classes inicia com letra maiuscula
 * O nome nao deve conter: Acentuacao, caracteres especiais, espaco
 * Nas classes Java, nao existe a implementacao da funcao main()
 * Toda classe java possui a seguinte forma
 * O nome da classe Jva deve ser o mesmo nome do arquivo java.
 * Tudo que estiver dentro das chaves faz parte da classe.
 * 
 * public class NomeDaClasse{
 * 
 * }
 */

//	Atributos
/*
 * Sao as caracteristicas da classe/molde/modelo de dados;
 * Podemos entender atributos como variaveis da classe;
 * Uma outra forma de nomenclatura para os atributos sao estados;
 * Atributos sao nomeados em letras minusculas, sem espacos, sem caracteres
 * especiais , sem acentuacao.
 * 
 */

//	Metodos
/*
 * Prodemos entender os metodos como a acao que é realizada por um objseto da classe;
 * Podemos entender tamém que os metodos sao compotamentos dos objetos da classe;
 * 
 */

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	//	Metodo para aumentar o preco do produto em 10
	void aumentar_preco(float valor) {
		this.preco= this.preco + 10 + valor;	
		}
	
}
