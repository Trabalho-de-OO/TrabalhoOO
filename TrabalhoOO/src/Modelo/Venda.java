package Modelo;

import Dao.ExceptionDAO;
import Dao.VendaDAO;

public class Venda {
	
	private int codVenda;
	private int idVenda;
	private String vendedor;
	private String veiculo;
	private int precoVenda;
	private String localVenda;
	
	public Venda() {
		
	}

	
	
	public Venda( int idVenda, String vendedor, String  veiculo, int precoVenda, 
			String localVenda) {
		this.vendedor = vendedor;
		this.veiculo = veiculo;
		this.precoVenda = precoVenda;
		this.localVenda = localVenda;
	}
	
	public int getCodVenda() {
		return codVenda;
	}
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public String getVendedor() {
		return vendedor;
	}


	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}


	public String getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}


	public  int getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(int precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public String getLocalVenda() {
		return localVenda;
	}

	public void setLocalVenda(String localVenda) {
		this.localVenda = localVenda;
	}
	

	public void cadastrarVenda(Venda venda) throws ExceptionDAO{
		
	new VendaDAO().cadastrarVenda(venda);
	
	}
	
	
	


	@Override
	public String toString() {
		return "\n" + "--VENDA--\n" 				
				 + "NOME DO VENDEDOR : " + vendedor + "\n"
				 + "VEICULO : " + veiculo + "\n"
				 + "PRECO DA VENDA : " + precoVenda + "\n" 
				 + "LOCAL DA VENDA: " + localVenda + "\n";
	}


	public void removerVenda(Venda venda) {
		
	}
	
}



