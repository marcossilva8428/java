package br.com.geekuniversity.secao09;

public class Controle {
	Televisao tv = new Televisao(false,0,0);
	
	void aumentaVolume() {
		tv.setVolume(tv.getVolume()+1);
	}
	void diminuiVolume() {
		if (tv.getVolume() != 0) {
			tv.setVolume(tv.getVolume()- 1);
		}	
	}
	
	void sobeCanal() {
		tv.setCanal(tv.getCanal()+1);
	}
	
	void desceCanal() {
		if (tv.getCanal() != 0) {
			tv.setCanal(tv.getCanal()-1);
		}
	
	}
	
	void ligaTv(boolean ligado) {
		tv.setLigado(ligado);
	}
	
	void desligaTv(boolean desligado) {
		tv.setLigado(desligado);
	}
	
	void statusTv() {
		if(tv.isLigado() == true) {
			System.out.println("A tv está ligada!");
			System.out.println("Canal: " + tv.getCanal());
			System.out.println("Volume: " + tv.getVolume());
		}else {
			System.out.println("A tv está desligada!");
			tv.setCanal(0);
			tv.setVolume(0);
		}
	}
}
