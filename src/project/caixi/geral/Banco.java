package project.caixi.geral;

import java.util.List;

import project.caixi.nucleo.enumerados.BancoEnum;

public class Banco {
	
	private int id;
	private BancoEnum nome;
	private List<Endereco> endereco;
	private List<Cliente> clientes;

	// ----------------------------------------------------------------------------------
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public BancoEnum getNome() {
		return nome;
	}
	
	public void setNome(BancoEnum nome) {
		this.nome = nome;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
