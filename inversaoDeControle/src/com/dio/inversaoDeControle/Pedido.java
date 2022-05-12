package com.dio.inversaoDeControle;

public class Pedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.gravar();
	}
	
	private EnviarEmails enviar = EnviarEmails.obterDadosEmail(); //Inversão de controle
	
	public void gravar() {
		this.enviar.retornar("Pedido realizado com sucesso!");
	}

}
