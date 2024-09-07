package br.com.geekuniversity.secao12;

public class Quadrado {
	private int lado,area,perimetro;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	
	public void calcularArea() {
		this.area = this.lado * this.lado;
	}
	
	public void calcularPerimetro() {
		this.perimetro = 4 * this.lado;
	}
	
	public String toString() {
		return "Area: " + this.area + "\n Perimeto: " + this.perimetro;
	}


	public float getLado() {
		return lado;
	}


	public float getArea() {
		return area;
	}


	public float getPerimetro() {
		return perimetro;
	}
}
