package project.caixi.nucleo.enumerados;

import project.caixi.nucleo.interfaces.IntfcEnumBase;

public enum TipoContaEnum implements IntfcEnumBase{
	
	CONTA_CORRENTE("CONTA CORRENTE", "CC", 0),
	CONTA_POUPANCA("CONTA POUPANÇA", "CP", 1),
	CONTA_DIGITAL("CONTA DIGITAL", "CT", 2);
	
	private String descricao;
	private String sigla;
	private int id;
	
	TipoContaEnum(String descricao, String sigla, int id) {
		this.descricao = descricao;
		this.sigla = sigla;
		this.id = id;
	}
	
	// -------------------------------------------------------------------------------

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
