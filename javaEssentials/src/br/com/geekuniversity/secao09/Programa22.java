package br.com.geekuniversity.secao09;

//	Objetos

/*
 * Objetos sao produtos/instancia da classe;
 */

public class Programa22 {
	public static void main(String[] args) {
		
		//	Declaracao de um objet;
		Produto p0;
		
		//	Declaraçao e instanciacao/iniciacao do objeto
		//	p1 -> instancia do objeto / objeto;
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("====== Produtos ======");
		System.out.println(p1.nome);
		System.out.println("R$"+p1.preco);
		System.out.println(p1.desconto+"%");
		
		p0 = new Produto();
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5;
	
		System.out.println(p0.nome);
		System.out.println("R$"+p0.preco);
		System.out.println(p0.desconto+"%");
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Marcos Silva";
		pessoa1.email = "marcos@silva.com";
		pessoa1.ano_nascimento = 1969;
		
		System.out.println("====== Pessoas ======");
		System.out.println("Nome: "+pessoa1.nome);
		System.out.println("E-mail: "+pessoa1.email);
		System.out.println("Ano de nascimento: "+pessoa1.ano_nascimento);

	}
}
