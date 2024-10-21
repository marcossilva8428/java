package br.com.geekuniversity.secao20;
/*
 * Para executar métodos em paralelo , nossa classe deve implementar
 * a interface runnable, e o metodo que precisa ser executado em paralelo
 * deve ser executado dentro do metodo run
 */

public class BarraDeProgresso implements Runnable{
	
	public void executa() {
		
		for(int i = 0; i < 1000; i ++) {
			System.out.println(i + " Barra de progresso...aguarde");
		}

	}
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(i + " Barra de progresso...aguarde");
		}
		
	}
}
