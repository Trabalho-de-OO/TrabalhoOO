package Modelo;

public class Venda {

	private String vendedor;
	private String veiculo;
	private double precoVenda;
	private String localVenda;

	
	
	public Venda( String vendedor, String  veiculo, double precoVenda, String localVenda) {
		this.vendedor = vendedor;
		this.veiculo = veiculo;
		this.precoVenda = precoVenda;
		this.localVenda = localVenda;
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


	public  double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
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