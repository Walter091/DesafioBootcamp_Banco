package project.caixi.geral;

public class Endereco {
	
	private int id;
	private String rua;
	private Bairro bairro;
 	private Municipio municipio;
	private String cep;
	private int numero;
	private String complemento;
	private String pontoDeReferencia;
	
	// ------------------------------------------------------------------------------------
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public Bairro getBairro() {
		return bairro;
	}
	
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	public Municipio getMunicipio() {
		return municipio;
	}
	
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}
	
	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}
	
	// ----------------------------------------------------------------------------------------
	
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Endereço: ");
    sb.append("Bairro: ").append(bairro.getNome()).append(" - ");
    sb.append(municipio.getNome());
    sb.append("( ").append(municipio.getUf().getSigla()).append(" )");

    return sb.toString();
  }

}

