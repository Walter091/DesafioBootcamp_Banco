package project.caixi.nucleo.enumerados;

import project.caixi.nucleo.interfaces.IntfcEnumBase;

public enum BancoEnum implements IntfcEnumBase{
	
	BRADESCO("BRADESCO", "BD", 0, false),
	SANTANDER("SANTANDER", "ST", 1, false),
	BRASIL("BRASIL", "BR", 2, false),
	MERCADO_LIVRE("MERCADO LIVRE", "MC", 3, true),
	PIC_PAY("PIC PAY", "PP", 4, true),
	NUBANK("NUBANK", "NB", 5, true);

	private String descricao;
	private String sigla;
	private int id;
	private boolean digital;
	
	BancoEnum(String descricao, String sigla, int id, boolean digital) {
		this.descricao = descricao;
		this.sigla = sigla;
		this.id = id;
		this.digital = digital;
	}
	
	// -------------------------------------------------------------------------------------

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

	public boolean isDigital() {
		return digital;
	}	
	
}
