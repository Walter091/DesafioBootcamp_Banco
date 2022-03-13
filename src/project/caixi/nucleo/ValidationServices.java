package project.caixi.nucleo;

import project.caixi.geral.ContaCorrente;
import project.caixi.geral.base.Conta;

public class ValidationServices {
	
	// Esta classe vai servir para validar quaisquer quest�es do projeto.
	// como n�o tem uma estrutura de packages e folders boa, vou tentar concentrar tudo nessa.
	
	public boolean validarTransferencia(Conta contaDoa, Conta contaRecebe, Float valor) {
		validarValorTransferencia(valor);
		if (!contaDoa.getCliente().equals(contaRecebe.getCliente())) { 
			if (contaDoa.getAgencia().getNome().equals(contaRecebe.getAgencia().getNome())) {
				if(contaRecebe != null) {
					return true;
				}
			}
		
		} else {
			System.out.println(" >>>> Imposs�vel Continuar com a Opera��o. (Contas diferentes) <<<<  " );
			System.out.println(" >>>> Ambas as contas continuam com o mesmo valor <<<<  " );
		}
		return false;
		
	}
	
	private static final Float VALOR_MAX_TRANSFERENCIA = 5000F;
	public boolean validarValorTransferencia(Float valor) {		
		return valor <= VALOR_MAX_TRANSFERENCIA ? true : false;
	}
	
	// ------------------------------------------------------------------------------------
	
	public boolean validarValorLimiteCartaoCredito(Float valor, ContaCorrente cc) {
		return valor <= cc.getCartaoCredito().getLimite() ? true : false;
	}
	
	public boolean validarParcelas(ContaCorrente cc) {
		if (cc.getCartaoCredito().isDivide()) {
			if (cc.getCartaoCredito().getQtdParcelas() > 10) {
				System.out.println(" >>>> Imposs�vel Parcelar em mais de 10 vezes!! <<<<  " );
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	
	// ------------------------------------------------------------------------------------
	
	// implementar aqui valida��o referente a entrada do cpf e do cep.
}
