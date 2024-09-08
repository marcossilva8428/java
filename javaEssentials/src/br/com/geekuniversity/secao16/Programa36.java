package br.com.geekuniversity.secao16;
//	Tratando excessoes com try/catch

/*
 * Utilizamos o try para tentar realizar algo, geralmente realizar aquilo que 
 * pode acarretar em um problema.
 * 
 * Utilizamos o catch para capturar o erro e com isso oferecer ao usu�rio do sistema
 * uma mensagem adequada sem que o sistema quebre.
 */

public class Programa36 {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		
		for(int i = 0; i <= numeros.length; i++) {
			
			try {//	Tente fazer isso 
				numeros[i] = i + 3 * 2;
				System.out.println(numeros[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Voc� est� tentando acessar uma posi��o do array que n�o existe.");
			}
			
		}
		
	}
}
