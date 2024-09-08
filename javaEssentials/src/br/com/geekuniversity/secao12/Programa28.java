package br.com.geekuniversity.secao12;
//	Heranca

public class Programa28 {
	public static void main(String[] args) {
//		Pessoa p1 = new Pessoa("Joao da Silva", 1935, "joao@silva.com");
//		System.out.println(p1.getNome());
//		System.out.println(p1);
//		System.out.println("\n");
		
		
		Aluno a1 = new Aluno("Joelma da Silva", 2001, "joelma@silva.com","1234");
		System.out.println(a1.getNome());
		System.out.println("\n");
//		System.out.println("Ano de Nascimento: " + a1.getAnoNascimento());
//		System.out.println("Ra: " + a1.getRa());
//		System.out.println("Ra: " + a1.getEmail());
		System.out.println(a1);
		System.out.println("\n");
		
		Professor prof1 = new Professor("Reinaldo da Silva",1985,"reinaldo@silva.com","123");
		System.out.println(prof1.getNome());
		System.out.println("\n");
//		System.out.println("Ano de Nascimento: " + prof1.getAnoNascimento());
//		System.out.println("Ra: " + prof1.getMatricula());
//		System.out.println("Ra: " + prof1.getEmail());
		System.out.println(prof1);
		System.out.println("\n");
	}
}
