package Modelo;

import java.util.ArrayList;


public class Dados{


	private ArrayList<Veiculo> dadosListaVeiculo = new ArrayList<>();
	private ArrayList<Venda> dadosListaVenda = new ArrayList<>();	
	
	public ArrayList<Veiculo> getDadosListaVeiculo() {
		return dadosListaVeiculo;
	}
	public void setDadosVeiculo(ArrayList<Veiculo> dadosVeiculo) {
		this.dadosListaVeiculo = dadosVeiculo;
	}
	public ArrayList<Venda> getDadosVenda() {
		return dadosListaVenda;
	}
	public void setDadosVenda(ArrayList<Venda> dadosVenda) {
		this.dadosListaVenda = dadosVenda;
	}
	
	public void dadosProntos() {
		for(int i = 0; i < 5; i++) {

			dadosListaVeiculo.add(new Veiculo("Veiculo" + i , (0001)+i ,"Cor"+i, 1 +i, 1 +i, 0000 + i, 
					"km"+i,"Categoria" + i, "Marca"+i));

			dadosListaVenda.add(new Venda(00000+i,"Vendedor" +i, "Veiculo"+i,(0)+i, 
					"Local da Venda" + i));
			
		}	
	}
/*
	public void cadastrarVeiculo(Veiculo v, int posicao, Dados d) {

		if(posicao == d.getDadosVeiculo().size()) {
			this.dadosVeiculo.add(v);

		}else {
			this.dadosVeiculo.set(posicao, v);
		}

	}
	*/

}


































