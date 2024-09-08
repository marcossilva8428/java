package br.com.geekuniversity.secao14;
// 	Interfaces - O que é e quando utilizar

/*
 * Interfaces sao conhecidas como "Contratos".
 * 
 * Uma empresa criou um contrato 'com regras' para definir a 
 * criacao de um produto ou servico.
 * 
 * Quem implementar este contrato e obrigado a seguir as regras.
 * 
 * O Joao, decidiu implementar um produto ou servico baseado neste contrato.
 * A Maria, tambem decidiu implementar um produto ou servico baseado no mesmo contrato.
 * 
 * Contrato para a confeccao de um bolo.
 * 	- O bolo precisa ser de chocolate;
 * 	- O bolo deve ter cobertura;
 * 	- O bolo deve ser recheado;
 */


public class Programa33 {
	public static void main(String[] args) {
		Ventilador vent1 = new Ventilador();
		
		System.out.println("A marca do ventilador e " + vent1.MARCA);
		
		vent1.desligar(); // Nao deve imprimir a mensage
		vent1.ligar(); // Deve imprimir a mensagem
		vent1.desligar(); // Deve imprimir a mensagem
	}
}
