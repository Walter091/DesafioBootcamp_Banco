import project.caixi.geral.Banco;
import project.caixi.geral.CartaoCredito;
import project.caixi.geral.Cliente;
import project.caixi.geral.ContaCorrente;
import project.caixi.geral.base.Conta;
import project.caixi.nucleo.enumerados.BancoEnum;
import project.caixi.nucleo.enumerados.SexoEnum;
import project.caixi.nucleo.enumerados.TipoContaEnum;
import project.caixi.nucleo.enumerados.TipoOperacaoEnum;

public class Teste {

	// Classe para testes das funcionalidades...
	public static void main(String[] args) {
		
		// Populando as entidades...
		
		Cliente cl1 = new Cliente();
		cl1.setId(1);
		cl1.setNome("Walter");
		cl1.setSexo(SexoEnum.MASCULINO);		
		
		Banco bancoCl1 = new Banco();
		bancoCl1.setId(1);
		bancoCl1.setNome(BancoEnum.BRADESCO);
		
		Conta contaCl1 = new Conta();
		contaCl1.setId(1);
		contaCl1.setAgencia(bancoCl1);
		contaCl1.setCliente(cl1);
		contaCl1.setNumero(00001);
		contaCl1.setTipoConta(TipoContaEnum.CONTA_CORRENTE);
		contaCl1.setDigital(false);
		contaCl1.setSaldo((float) 5000);
		
		// Executando...
		
		// Saque: 
		System.out.println("Saque: ");
		System.out.println("");
		System.out.println("Saldo Anterior: " + contaCl1.getSaldoFormatado());
		contaCl1.sacar((float) 2500);
		System.out.println("");
		System.out.println("Saldo Atual: " + contaCl1.getSaldoFormatado());
		
		System.out.println("---------------------------------------------");
		
		// Depósito: 
		System.out.println("Depósito: ");
		System.out.println("");
		System.out.println("Saldo Anterior: " + contaCl1.getSaldoFormatado());
		contaCl1.depositar((float) 2500);
		System.out.println("");
		System.out.println("Saldo Atual: " + contaCl1.getSaldoFormatado());
		
		System.out.println("---------------------------------------------");
		
		// Transferência: 
		
		// Populando as entidades...
		Cliente cl2 = new Cliente();
		cl2.setId(2);
		cl2.setNome("João");
		cl2.setSexo(SexoEnum.MASCULINO);		
		
		Banco bancoCl2 = new Banco();
		bancoCl2.setId(2);
		bancoCl2.setNome(BancoEnum.BRADESCO);

		Conta contaCl2 = new Conta();
		contaCl2.setId(2);
		contaCl2.setAgencia(bancoCl2);
		contaCl2.setCliente(cl2);
		contaCl2.setNumero(00002);
		contaCl2.setTipoConta(TipoContaEnum.CONTA_CORRENTE);
		contaCl2.setDigital(false);
		contaCl2.setSaldo((float) 5000);

		// Transferencia sem erros: 
		System.out.println("Transferência: ");
		System.out.println("");
		System.out.println("Saldo Anterior Próprietario: " + contaCl1.getSaldoFormatado());
		System.out.println("Saldo Anterior Receptor: " + contaCl2.getSaldoFormatado());
		contaCl1.transferir((float) 2500, contaCl2);
		System.out.println("");
		System.out.println("Saldo Atual Próprietario: " + contaCl1.getSaldoFormatado());
		System.out.println("Saldo Atual Receptor: " + contaCl2.getSaldoFormatado());		
		
		System.out.println("---------------------------------------------");
		
		// Saque Utilizando o cartão de crédito: 
		
		CartaoCredito cartao = new CartaoCredito();
		cartao.setBanco(bancoCl2);
		cartao.setCv("22/06");
		cartao.setDivide(true);
		cartao.setQtdParcelas(2);
		cartao.setLimite((float) 5000);
		cartao.setNumero("2698-28");
	
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setId(2);
		contaCorrente.setTipoOperacao(TipoOperacaoEnum.CARTAO_CREDITO);
		contaCorrente.setCartaoCredito(cartao);
		contaCorrente.setAgencia(bancoCl2);
		contaCorrente.setCliente(cl2);
		contaCorrente.setNumero(00003);
		contaCorrente.setTipoConta(TipoContaEnum.CONTA_CORRENTE);
		contaCorrente.setDigital(false);
		contaCorrente.setSaldo((float) 5000);
		
		System.out.println("Cartão de Crédito: ");
		System.out.println("");
		System.out.println("Saldo Anterior: " + contaCorrente.getSaldoFormatado());
		System.out.println("Saldo Anterior Cartão: " + contaCorrente.getCartaoCredito().getLimiteFormatado());
		contaCl1.usarCredito((float) 3000, contaCorrente);
		System.out.println("");
		System.out.println("Saldo Atual: " + contaCorrente.getSaldoFormatado());
		System.out.println("Saldo Atual Cartão: " + contaCorrente.getCartaoCredito().getLimiteFormatado());
		
		contaCl1.imprimirExtrato(contaCl1);
	}

}
