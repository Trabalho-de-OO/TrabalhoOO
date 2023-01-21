package Modelo;

import java.util.ArrayList;


public class Dados{

	private ArrayList<Comprador> dadosComprador = new ArrayList<>(); 
	private ArrayList<Vendedor> dadosVendedor = new ArrayList<>();
	private ArrayList<Veiculo> dadosVeiculo = new ArrayList<>();
	private ArrayList<Venda> dadosVenda = new ArrayList<>();
	private ArrayList<Concessionaria> dadosConcessionaria = new ArrayList<>();
	


	public void dadosProntos() {
		for(int i = 0; i < 4; i++) {

			dadosVeiculo.add(new Veiculo("Veiculo" + i, (0001)+i ,"Cor"+i, 1 +i, 1 +i, 0000.0 + i, 
					"km"+i,"Categoria"+i, "Marca"+i));

			dadosVenda.add(new Venda("Vendedor" +i, "Veiculo"+i,(0.5)+i, 
					"Local da Venda5"+i));

			dadosComprador.add(new Comprador("Nome Comprador"+i,"Email Comprador"+i ,
					(00004)+i,"Cpf"+i, "Endereco Comprador"+i , (0.4)+i ,"Veiculo Desejado"+i));

			dadosVendedor.add(new Vendedor("Nome Vendedor"+i,"Email Vendedor"+i,
					(00003)+i ,"Cpf"+i,"Endereco"+i,(03)+i));
			
			dadosConcessionaria.add(new Concessionaria("Nome Concessionaria"+i, (100)+i, (01)+i,
					"Endereço da Venda"+i));
			
		}	

	}

	//Getts e Setts
	public ArrayList<Comprador> getDadosComprador() {
		return dadosComprador;
	}
	public void setDadosComprador(ArrayList<Comprador> dadosComprador) {
		this.dadosComprador = dadosComprador;
	}
	public ArrayList<Vendedor> getDadosVendedor() {
		return dadosVendedor;
	}
	public void setDadosVendedor(ArrayList<Vendedor> dadosVendedor) {
		this.dadosVendedor = dadosVendedor;
	}
	public ArrayList<Veiculo> getDadosVeiculo() {
		return dadosVeiculo;
	}
	public void setDadosVeiculo(ArrayList<Veiculo> dadosVeiculo) {
		this.dadosVeiculo = dadosVeiculo;
	}
	public ArrayList<Venda> getDadosVenda() {
		return dadosVenda;
	}
	public void setDadosVenda(ArrayList<Venda> dadosVenda) {
		this.dadosVenda = dadosVenda;
	}
	public ArrayList<Concessionaria> getDadosConcessionaria() {
		return dadosConcessionaria;
	}
	public void setDadosConcessionaria(ArrayList<Concessionaria> dadosConcessionaria) {
		this.dadosConcessionaria = dadosConcessionaria;
	}

	public void cadastrarVeiculo(Veiculo v, int posicao, Dados d) {

		if(posicao == d.getDadosVeiculo().size()) {
			this.dadosVeiculo.add(v);

		}else {
			this.dadosVeiculo.set(posicao, v);
		}

	}

}


































