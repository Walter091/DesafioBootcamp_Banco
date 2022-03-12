package java.caixi.nucleo.enumerados;

import java.caixi.nucleo.interfaces.IntfcEnumBase;

public enum SexoEnum implements IntfcEnumBase{
	
	MASCULINO("MASCULINO", "M", 0),
	FEMININO("FEMININO", "F", 1);
	
	private String descricao;
	private String sigla;
	private int id;
	
	SexoEnum(String descricao, String sigla, int id) {
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
