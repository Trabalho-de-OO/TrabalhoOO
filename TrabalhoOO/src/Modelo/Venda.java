package Modelo;

public class Venda {
	private int idVenda;
	private String vendedor;
	private String veiculo;
	private int precoVenda;
	private String localVenda;

	
	
	public Venda( int idVenda, String vendedor, String  veiculo, int precoVenda, 
			String localVenda) {
		this.vendedor = vendedor;
		this.veiculo = veiculo;
		this.precoVenda = precoVenda;
		this.localVenda = localVenda;
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


	@Override
	public String toString() {
		return "\n" + "--VENDA--\n" 				
				 + "NOME DO VENDEDOR : " + vendedor + "\n"
				 + "VEICULO : " + veiculo + "\n"
				 + "PRECO DA VENDA : " + precoVenda + "\n" 
				 + "LOCAL DA VENDA: " + localVenda + "\n";
	}



}