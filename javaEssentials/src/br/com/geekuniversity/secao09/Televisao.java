package br.com.geekuniversity.secao09;

public class Televisao {
	private boolean ligado;
	private int volume;
	private int canal;
	

	public Televisao() {}
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public Televisao(boolean ligado, int volume, int canal) {
		this.ligado = false;
		this.canal = 0;
		this.volume = 0;
	}
}
