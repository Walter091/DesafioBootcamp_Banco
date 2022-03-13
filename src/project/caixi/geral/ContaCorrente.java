package project.caixi.geral;

import project.caixi.geral.base.Conta;
import project.caixi.nucleo.ValidationServices;

public class ContaCorrente extends Conta {
	
	private CartaoCredito cartaoCredito;
	
	
	public static void debitarLimiteCartaoCredito(Float valor, ContaCorrente cc) {
		if ( (valor != null ) && (valor > 0) ) {
			ValidationServices vl = new ValidationServices();
			if (vl.validarValorLimiteCartaoCredito(valor, cc)) {
				if (vl.validarParcelas(cc)) {
					Float valorLimite = cc.getCartaoCredito().getLimite();
					valorLimite -= valor/cc.getCartaoCredito().getQtdParcelas();
					cc.getCartaoCredito().setLimite(valorLimite);
					
				} else {
					Float valorLimite = cc.getCartaoCredito().getLimite();
					valorLimite -= valor;
				}
			} else {
				System.out.println(">>> Saldo Insuficiente!! <<<");
			}
		}
	}
	
	// ----------------------------------------------------------------------------------
	
	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}
	
	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
}
