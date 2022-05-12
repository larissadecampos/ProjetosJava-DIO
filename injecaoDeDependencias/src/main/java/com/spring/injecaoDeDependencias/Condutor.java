package com.spring.injecaoDeDependencias;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {
	
	public static void main(String[] args) {
		Condutor condutor = new Condutor(new Moto());
		condutor.automovel();
	}
	
	@Autowired  //injeção de dependência
	private Veiculo veiculo;
	
	public Condutor(Veiculo objeto) {
		this.veiculo = objeto;
	}
	
	public void automovel() {
		veiculo.acao();
	}

}
