package br.com.geekuniversity.secao21;
//	Filas

/* Todo elemento entra no final da fila.
 * 
 * O primeiro elmento a entrar � tamb�m o primeiro a sair
 * 
 * 
 * <- [0][1][2][3][4][5]
 */

public class Programa62 {

	public static void main(String[] args) {
		Fila fila = new Fila();
		System.out.println(fila);

		fila.adiciona("Helena");
		fila.adiciona("Janaina");
		fila.adiciona("Marcos");
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		
		fila.remove();
		
		fila.remove();
		
		System.out.println(fila);
		
		System.out.println(fila.vazia());
		fila.remove();
	}

}
