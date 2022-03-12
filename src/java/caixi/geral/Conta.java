package java.caixi.geral;

import java.caixi.nucleo.ValidationServices;
import java.caixi.nucleo.enumerados.TipoContaEnum;
import java.caixi.nucleo.enumerados.TipoOperacaoEnum;
import java.caixi.nucleo.interfaces.IConta;

public class Conta implements IConta{
	
	private int id;
	private int numero;
	private Banco agencia;
	private TipoContaEnum tipoConta;
	private boolean digital;
	private Float saldo;
	private Cliente cliente;
	

	// ------------------------------------------------------------------------------------
	
	private static int QTD_SAQUE = 0;
	private static int QTD_DEPOSITO = 0;
	private static int QTD_TRANSFERENCIA = 0;
	
	@Override
	public void sacar(Float valor) {
		this.saldo -= valor;
		QTD_SAQUE += 1;
		imprimirNotaFiscal(TipoOperacaoEnum.SAQUE, valor);
	}

	@Override
	public void depositar(Float valor) {
		 this.saldo += valor;
		 QTD_DEPOSITO += 1;
		 imprimirNotaFiscal(TipoOperacaoEnum.DEPOSITO, valor);
		
	}

	@Override
	public void transferir(Float valor, Conta contaRecebe) {
		ValidationServices vl = new ValidationServices();
		// Metódo de validação de transferência...
		vl.validarTransferencia(this.agencia, contaRecebe.agencia, valor);
		QTD_TRANSFERENCIA += 1;
		this.sacar(valor);
		depositar(saldo);
		imprimirNotaFiscal(TipoOperacaoEnum.TRANSFERIR, valor);
	}
	
	public String imprimirNotaFiscal(TipoOperacaoEnum operacao, Float valor) {
		String ntFiscal = ">>>> Nota Fiscal <<<< "
						+ "Agência: " + agencia.getNome()
						+ "Número Conta: " + numero 
						+ "Tipo Conta: " + tipoConta.getDescricao()
						+ " "
						+ " ----------------------------------------"
						+ " "
						+ ">>>> " + operacao.getDescricao() + " <<<<"
						+ "Valor: " + valor
						+ "Saldo atual: " + saldo;
						
						
				
		return ntFiscal;
	}
	
	public String imprimirExtrato(Conta conta) {
		String extrato = ">>>> Extrato <<<< "
				+ "Agência: " + agencia.getNome()
				+ "Número Conta: " + numero 
				+ "Tipo Conta: " + tipoConta.getDescricao()
				+ " "
				+ " ----------------------------------------"
				+ " "
				+ ">>>> Movimentações <<<<"
				+ "Quantidade de Saques: " + QTD_SAQUE
				+ "Quantidade de Depósitos: " + QTD_DEPOSITO
				+ "Quantidade de Transferências: " + QTD_TRANSFERENCIA
				+ " "
				+ " ----------------------------------------"
				+ " "
				+ "Saldo atual: " + saldo;
				
				
		
		return extrato;
		
	}

	// ------------------------------------------------------------------------------------
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Banco getAgencia() {
		return agencia;
	}
	
	public void setAgencia(Banco agencia) {
		this.agencia = agencia;
	}
	
	public TipoContaEnum getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(TipoContaEnum tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public boolean isDigital() {
		return digital;
	}
	
	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
