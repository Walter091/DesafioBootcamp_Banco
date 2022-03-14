package project.caixi.geral.base;

import project.caixi.geral.Banco;
import project.caixi.geral.Cliente;
import project.caixi.geral.ContaCorrente;
import project.caixi.nucleo.ValidationServices;
import project.caixi.nucleo.enumerados.TipoContaEnum;
import project.caixi.nucleo.enumerados.TipoOperacaoEnum;
import project.caixi.nucleo.interfaces.IConta;
import project.caixi.nucleo.utils.NumberUtils;

public class Conta implements IConta{
	
	private int id;
	private int numero;
	private Banco agencia;
	private TipoContaEnum tipoConta;
	private boolean digital;
	private Float saldo;
	private Cliente cliente;
	private TipoOperacaoEnum tipoOperacao;

	// ------------------------------------------------------------------------------------
	
	private static int QTD_SAQUE = 0;
	private static int QTD_DEPOSITO = 0;
	private static int QTD_TRANSFERENCIA = 0;
	
	public void usarCredito(Float valor, ContaCorrente cc) {
		if (cc.getTipoOperacao() == TipoOperacaoEnum.CARTAO_CREDITO) {
			ContaCorrente.debitarLimiteCartaoCredito(valor, cc);
		}
	}
	
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
		if(vl.validarTransferencia(this, contaRecebe, valor)) {
			QTD_TRANSFERENCIA += 1;
			this.sacar(valor);
			contaRecebe.depositar(valor);
			imprimirNotaFiscal(TipoOperacaoEnum.TRANSFERIR, valor);	
		};
	}
		
	public void imprimirNotaFiscal(TipoOperacaoEnum operacao, Float valor) {
		String ntFiscal = ">>>> Nota Fiscal <<<< "
						+ " | Agência: " + agencia.getNome()
						+ " | Número Conta: " + numero 
						+ " | Tipo Conta: " + tipoConta.getDescricao()
						+ " >> "
						+ " | >>>> " + operacao.getDescricao() + " <<<<"
						+ " | Valor: " + NumberUtils.formatCurrency(valor)
						+ " | Saldo atual: " + getSaldoFormatado();
						
						
				
		System.out.println(ntFiscal);
	}
	
	public void imprimirExtrato(Conta conta) {
		String extrato = ">>>> Extrato <<<< "
				+ " | Agência: " + agencia.getNome()
				+ " | Número Conta: " + numero 
				+ " | Tipo Conta: " + tipoConta.getDescricao()
				+ " >> "
				+ " | >>>> Movimentações <<<<"
				+ " | Quantidade de Saques: " + QTD_SAQUE
				+ " | Quantidade de Depósitos: " + QTD_DEPOSITO
				+ " | Quantidade de Transferências: " + QTD_TRANSFERENCIA
				+ " >> "
				+ " Saldo atual: " + getSaldoFormatado();
				
				
		
		System.out.println(extrato);
		
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

	public String getSaldoFormatado() {
		return NumberUtils.formatCurrency(saldo);
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

	
	public TipoOperacaoEnum getTipoOperacao() {
		return tipoOperacao;
	}

	
	public void setTipoOperacao(TipoOperacaoEnum tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	
	
}
