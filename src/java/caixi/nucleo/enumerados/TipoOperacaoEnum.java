package java.caixi.nucleo.enumerados;

import java.caixi.nucleo.interfaces.IntfcEnumBase;

public enum TipoOperacaoEnum implements IntfcEnumBase{
		
	SAQUE("SAQUE", "SQ", 0),
	DEPOSITO("DEPÓSITO", "DP", 1),
	TRANSFERIR("TRANSFERIR", "TR", 2);
	
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
