package project.caixi.nucleo.interfaces;

import project.caixi.geral.base.Conta;

public interface IConta {
	
	void sacar(Float valor);
	
	void depositar(Float valor);
	
	void transferir(Float valor, Conta contaRecebe);
}
