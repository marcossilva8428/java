package br.com.geekuniversity.secao11;
/*
 * Getters e Setters
 * 
 * Getter 
 * 	- e um metodo publico que serve para consultar dados;
 *  - A nomenclatura desses metodos é get_nome_do_atributo()
 */

public class Conta {
	int numero;
	private float saldo;
	private float limite;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		if(valor <= this.saldo){
			this.saldo = this.saldo - valor; 
			System.out.println("Saldo realizado com sucesso");
		}else if( valor <= (this.saldo + this.limite)) {
			//	calculando o valor excedente do saque
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saldo realizado com sucesso");
		}else {
			System.out.println("Saldo insuficiente"); 
			}
		
	}
	
	/**
	 * Metodo para realizar deposito 
	 * @param valor a ser depositado
	 */
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	//	Metodo getter do atributo saldo
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	
	
	
}
