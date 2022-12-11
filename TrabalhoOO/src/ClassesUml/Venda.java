package ClassesUml;

public class Venda {

	private int idVenda;
	private Vendedor vendedor;
	private Veiculo veiculo;


	public Venda(int idVenda, Vendedor vendedor, Veiculo veiculo) {
		this.idVenda = idVenda;
		this.vendedor = vendedor;
		this.veiculo = veiculo;
	}


	public int getIdVenda() {
		return idVenda;
	}


	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

@Override
public String toString() {
	return "IDvenda : " + idVenda +
			"|" + "DadosVeiculo :" + "|" + veiculo;
			
			
}



}
