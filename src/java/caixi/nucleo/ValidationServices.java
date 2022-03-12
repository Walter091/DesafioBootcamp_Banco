package java.caixi.nucleo;

import java.caixi.geral.Banco;

public class ValidationServices {
	
	// Esta classe vai servir para validar quaisquer questões do projeto.
	// como não tem uma estrutura de packages e folders boa, vou tentar concentrar tudo nessa.
	
	public boolean validarTransferencia(Banco agenciaDoa, Banco agenciaRecebe, Float valor) {
		validarValorTransferencia(valor);
		if (agenciaDoa.equals(agenciaRecebe)) {
			if(agenciaRecebe != null) {
				return true;
			}
		}
		return false;
		
	}
	
	private static final Float VALOR_MAX_TRANSFERENCIA = 5000F;
	public boolean validarValorTransferencia(Float valor) {		
		return valor <= VALOR_MAX_TRANSFERENCIA ? true : false;
	}
	
	// ------------------------------------------------------------------------------------
	
	// implementar aqui validação referente a entrada do cpf e do cep.
}
