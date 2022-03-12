package java.caixi.nucleo.interfaces;

import java.caixi.geral.Conta;

public interface IConta {
	
	void sacar(Float valor);
	
	void depositar(Float valor);
	
	void transferir(Float valor, Conta contaRecebe);
}
