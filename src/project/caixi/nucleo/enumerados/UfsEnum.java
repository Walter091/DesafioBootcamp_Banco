package project.caixi.nucleo.enumerados;

public enum UfsEnum {
	
	  AMAZONAS("Amazonas", "AM", "Manaus"),
	  ALAGOAS("Alagoas", "AL", "Macei�"),
	  ACRE("Acre", "AC", "Rio Branco"),
	  AMAPA("Amap�", "AP", "Macap�"),
	  BAHIA("Bahia", "BA", "Salvador"),
	  PARA("Par�", "PA", "Bel�m"),
	  MATO_GROSSO("Mato Grosso", "MT", "Cuiab�"),
	  MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	  MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", "Campo Grande"),
	  GOIAS("Goi�s", "GO", "Goi�nia"),
	  MARANHAO("Maranh�o", "MA", "S�o Lu�s"),
	  RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	  TOCANTINS("Tocantins", "TO", "Palmas"),
	  PIAUI("Piau�", "PI", "Teresina"),
	  SAO_PAULO("S�o Paulo", "SP", "S�o Paulo"),
	  RONDONIA("Rond�nia", "RO", "Porto Velho"),
	  RORAIMA("Roraima", "RR", "Boa Vista"),
	  PARANA("Paran�", "PR", "Curitiba"),
	  CEARA("Cear�", "CE", "Fortaleza"),
	  PERNAMBUCO("Pernambuco", "PE", "Recife"),
	  SANTA_CATARINA("Santa Catarina", "SC", "Florian�polis"),
	  PARAIBA("Para�ba", "PB", "Jo�o Pessoa"),
	  RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", "Natal"),
	  ESPIRITO_SANTO("Esp�rito Santo", "ES", "Vit�ria"),
	  RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
	  SERGIPE("Sergipe", "SE", "Aracaju"),
	  DISTRITO_FEDERAL("Distrito Federal", "DF", "Bras�lia");

	  private final String nome;
	  private final String sigla;
	  private final String capital;

	  UfsEnum(final String nome, final String sigla, final String capital) {
	    this.nome = nome;
	    this.sigla = sigla;
	    this.capital = capital;
	  }

	  // -------------------------------------------------------------------------------------
	  
	  public static UfsEnum fromUF(final String nomeUf) {
	    for (final UfsEnum uf : UfsEnum.values()) {
	      if (uf.nome.equalsIgnoreCase(nomeUf)) {
	        return uf;
	      }
	    }

	    throw new IllegalArgumentException(nomeUf);
	  }

	  
	  public static UfsEnum fromSigla(final String sigla) {
	    for (final UfsEnum uf : UfsEnum.values()) {
	      if (uf.sigla.equalsIgnoreCase(sigla)) {
	        return uf;
	      }
	    }

	    throw new IllegalArgumentException(sigla);
	  }

	  public static UfsEnum fromCapital(final String capital) {
	    for (final UfsEnum uf : UfsEnum.values()) {
	      if (uf.capital.equalsIgnoreCase(capital)) {
	        return uf;
	      }
	    }

	    throw new IllegalArgumentException(capital);
	  }

	  public String getSigla() {
	    return this.sigla;
	  }


	  public String getNome() {
	    return this.nome;
	  }

	  public String getCapital() {
	    return this.capital;
	  }

	  // -----------------------------------------------------------------------------------
	  
	  @Override
	  public String toString() {
	    final StringBuilder sb = new StringBuilder("UnidadeFederacao{");
	    sb.append("nome='").append(nome).append('\'');
	    sb.append(", sigla='").append(sigla).append('\'');
	    sb.append(", capital='").append(capital).append('\'');
	    sb.append('}');
	    return sb.toString();
	  }
}


