package project.caixi.nucleo.enumerados;

import project.caixi.nucleo.interfaces.IntfcEnumBase;

public enum TipoOperacaoEnum implements IntfcEnumBase{
		
	SAQUE("SAQUE", "SQ", 0),
	CARTAO_CREDITO("UTILIZAR CARTÃO DE CRÉDITO", "CC", 1),
	DEPOSITO("DEPÓSITO", "DP", 2),
	TRANSFERIR("TRANSFERIR", "TR", 3);
	
	private String descricao;
	private String sigla;
	private int id;
	
	TipoOperacaoEnum(String descricao, String sigla, int id) {
		this.descricao = descricao;
		this.sigla = sigla;
		this.id = id;
	}

	// ---------------------------------------------------------------------------------


	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String getSigla() {
		return sigla;
	}

	@Override
	public int getId() {
		return id;
	}
}
