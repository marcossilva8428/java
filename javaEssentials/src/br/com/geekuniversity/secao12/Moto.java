package br.com.geekuniversity.secao12;

public class Moto {
	private String marca,modelo, cor,marcha_string = "Neutro";
	private int marcha = 0;
	
	
//	
//	imprimir()
//	trocar_marcha()
	
	public Moto(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	
	public int getMarcha() {
	
		return marcha;
	}



	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}



	public String getMarca() {
		return marca;
	}



	public String getModelo() {
		return modelo;
	}



	public String getCor() {
		return cor;
	}


	void marcha() {
		switch(this.marcha) {
		case 1:
			marcha_string = "Primeira";
			break;
		case 2:
			marcha_string = "Segunda";
			break;
		case 3:
			marcha_string = "Terceira";
			break;
		case 4:
			marcha_string = "Quarta";
			break;
		case 5:
			marcha_string = "Quinta";
			break;
		default:
			marcha_string = "Neutro";
			break;
		}
	}

	void subir_marcha(){
		if(this.marcha == 5) {
			this.marcha = 5;
			marcha();
			}else {
				this.marcha += 1;
				marcha();
			}
		}
	
	void descer_marcha() {
		if (this.marcha == 0) {
			marcha();
		}else {
			this.marcha -= 1;
			marcha();
		}
	}
	
	public String toString() {
		return "\n Marca: " + this.marca + "\n Modelo: " + this.modelo + "\n Cor: " + this.cor + "\n Marcha: " + this.marcha_string;
	}
	
}
