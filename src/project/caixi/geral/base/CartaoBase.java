package project.caixi.geral.base;

import project.caixi.geral.Banco;
import project.caixi.nucleo.utils.NumberUtils;

public class CartaoBase {

	private String numero;
	private String cv;
	private Banco banco;
	private Float limite = 5000F;
	
	// ------------------------------------------------------------------------------------
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getCv() {
		return cv;
	}
	
	public void setCv(String cv) {
		this.cv = cv;
	}
	
	public Banco getBanco() {
		return banco;
	}
	
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public Float getLimite() {
		return limite;
	}
	
	public String getLimiteFormatado() {
		return NumberUtils.formatCurrency(limite);
	}
	
	public void setLimite(Float limite) {
		this.limite = limite;
	}
	

}
