package project.caixi.nucleo;

import project.caixi.geral.ContaCorrente;
import project.caixi.geral.base.Conta;

public class ValidationServices {
	
	// Esta classe vai servir para validar quaisquer questões do projeto.
	// como não tem uma estrutura de packages e folders boa, vou tentar concentrar tudo nessa.
	
	public boolean validarTransferencia(Conta contaDoa, Conta contaRecebe, Float valor) {
		validarValorTransferencia(valor);
		if (!contaDoa.getCliente().equals(contaRecebe.getCliente())) { 
			if (contaDoa.getAgencia().getNome().equals(contaRecebe.getAgencia().getNome())) {
				if(contaRecebe != null) {
					return true;
				}
			}
		
		} else {
			System.out.println(" >>>> Impossível Continuar com a Operação. (Contas diferentes) <<<<  " );
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
				System.out.println(" >>>> Impossível Parcelar em mais de 10 vezes!! <<<<  " );
				return false;
			} else {
				return true;
			}
		}
		return false;
	}
	
	// ------------------------------------------------------------------------------------
	
	// implementar aqui validação referente a entrada do cpf e do cep.
}
