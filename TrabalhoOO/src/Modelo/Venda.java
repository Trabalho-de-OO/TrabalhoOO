package Modelo;

import java.util.ArrayList;

import Dao.ExceptionDAO;
import Dao.VeiculoDAO;
import Dao.VendaDAO;

public class Venda {
	
	private int codVenda;
	private String vendedor;
	private String veiculo;
	private int precoVenda;
	private String localVenda;
	
	public Venda() {
		
	}

	public Venda( String vendedor, String  veiculo, int precoVenda, 
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
	public ArrayList<Venda> consultarVenda(String vendedor) throws ExceptionDAO{
		return new VendaDAO().consultarVenda(vendedor);
	}	
	
	
	
	public void mudarVenda(Venda venda) throws ExceptionDAO{
		new VendaDAO().mudarVenda(venda);
	}
	
public void apagarVenda(Venda venda) throws ExceptionDAO{
	
	new VendaDAO().apagarVenda(venda);
	
}	
	


	@Override
	public String toString() {
		return "\n" + "--VENDA--\n" 				
				 + "NOME DO VENDEDOR : " + vendedor + "\n"
				 + "VEICULO : " + veiculo + "\n"
				 + "PRECO DA VENDA : " + precoVenda + "\n" 
				 + "LOCAL DA VENDA: " + localVenda + "\n";
	}

	
}



