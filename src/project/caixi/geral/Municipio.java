package project.caixi.geral;

import project.caixi.nucleo.enumerados.UfsEnum;

public class Municipio {
	
	private int id;
	private String nome;
	private UfsEnum uf;
	
	// -----------------------------------------------------------------------------------
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public UfsEnum getUf() {
		return uf;
	}
	
	public void setUf(UfsEnum uf) {
		this.uf = uf;
	}
	
}
