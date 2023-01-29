/*
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
	
	
	
	public ArrayList<Venda> getDadosListaVenda() {
		return dadosListaVenda;
	}
	public void setDadosListaVenda(ArrayList<Venda> dadosListaVenda) {
		this.dadosListaVenda = dadosListaVenda;
	}
	
	
	
	public void dadosProntos() {
		for(int i = 0; i < 5; i++) {

			dadosListaVeiculo.add(new Veiculo("Veiculo" + i , (0001)+i ,"Cor"+i, 1 +i, 1 +i, 0000 + i, 
					0+i,"Categoria" + i, "Marca"+i));


			dadosListaVenda.add(new Venda(00000+i,"Vendedor" +i, "Veiculo"+i,(0)+i, 
					"Local da Venda" + i));
			
			
		}	
	}
	
	
	public void cadastrarVeiculo(Veiculo veiculo, Dados controleDados, int posicao) {
		if(posicao == controleDados.getDadosListaVeiculo().size()) {
			dadosListaVeiculo.add(veiculo);
		} else {
			dadosListaVeiculo.set(posicao, veiculo);
		}
		
	}
	

	public void cadastrarVenda(Venda venda, Dados controleDados, int posicao) {
		if(posicao == controleDados.getDadosListaVeiculo().size()) {
			dadosListaVenda.add(venda);
		} else {
			dadosListaVenda.set(posicao, venda);
		}
		
	}


}

*/
































