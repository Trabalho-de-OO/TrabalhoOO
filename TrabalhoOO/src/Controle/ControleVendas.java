package Controle;

import java.util.List;

import Modelo.Venda;

public class ControleVendas {
	
	private List<Venda> vendas ;
	
	
	public ControleVendas(ControleDados dados) {
		vendas = dados.getDadosVendas();
	}
	
	public String[] getListaVenda() {
		String[] listaVenda = new String[vendas.size()];
		int i;
		for(i = 0; i < vendas.size(); i++) {
			listaVenda[i] = (" " + vendas.get(i).getVendedor());
		}
		return listaVenda;
	}
	

}
