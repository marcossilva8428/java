package br.com.geekuniversity.secao09;
/*
 * 3. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar a televis�o, como
ligar e desligar, trocar canais e aumentar e diminuir o volume.
- O controle de volume permite aumentar ou diminuir a pot�ncia do volume de som em uma
unidade de cada vez.
- O controle de canal permite aumentar ou diminuir o n�mero do canal em uma unidade, por�m
tamb�m possibilita trocar para um canal indicado.
 */
public class Exercicio03 {
	public static void main(String[] args) {
		Controle ctrl = new Controle();
		
		ctrl.ligaTv(true);
		ctrl.statusTv();
		ctrl.aumentaVolume();
		ctrl.aumentaVolume();
		ctrl.aumentaVolume();
		ctrl.aumentaVolume();
		ctrl.statusTv();
		ctrl.diminuiVolume();
		ctrl.sobeCanal();
		ctrl.sobeCanal();
		ctrl.sobeCanal();
		ctrl.sobeCanal();
		ctrl.statusTv();
		ctrl.desceCanal();
		ctrl.statusTv();
		ctrl.ligaTv(false);
		ctrl.statusTv();
		

	}
}
