package project.caixi.geral;

import project.caixi.geral.base.CartaoBase;

public class CartaoCredito extends CartaoBase{
	
	private boolean divide;
	private int qtdParcelas;
	
	// -------------------------------------------------------------------------------------

	public boolean isDivide() {
		return divide;
	}

	public void setDivide(boolean divide) {
		this.divide = divide;
	}

	public int getQtdParcelas() {
		return qtdParcelas;
	}

	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	
}
