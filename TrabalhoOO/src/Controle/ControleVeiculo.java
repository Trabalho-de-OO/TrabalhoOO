package Controle;
import java.util.ArrayList;
import java.util.List;

import Modelo.Dados;
import Modelo.Veiculo;




public class ControleVeiculo {
	
	private List<Veiculo> veiculo;
	
	
	public ControleVeiculo(ControleDados dados) {
		veiculo = dados.getDadosVeiculo();
	}
	
	
	
	public String[] getListaVeiculo() {
		String[] listaVeiculo = new String[veiculo.size()];
		int i;
		for(i = 0; i < veiculo.size(); i++) {
			listaVeiculo[i] = (" " + veiculo.get(i).getNomeVeiculo());
		}
		return listaVeiculo;
	}
	 
}
