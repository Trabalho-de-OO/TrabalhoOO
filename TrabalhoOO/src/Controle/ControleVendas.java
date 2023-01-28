package Controle;

import java.util.ArrayList;

import Dao.ExceptionDAO;
import Modelo.Venda;

public class ControleVendas {
	
	private ArrayList<Venda> vendas ;
	
	public ControleVendas() {
		
	}
	
	public ControleVendas(ControleDados dados) {
		vendas = dados.getDadosListaVenda();
	}
	public String[] getListaVenda() {
		String[] listaVenda = new String[vendas.size()];
		int i;
		for(i = 0; i < vendas.size(); i++) {
			listaVenda[i] = (" " + vendas.get(i).getVendedor() + "-------" + vendas.get(i).getPrecoVenda());
		}
		return listaVenda;
	}
	
	public boolean cadastrarVendas(int idVenda, String vendedor, String veiculo, int precoVenda,String localVenda) throws ExceptionDAO {
		
		if(idVenda > 0 && vendedor  != null && vendedor.length() > 0 &&  veiculo != null && veiculo.length() > 0 &&
				precoVenda > 0 && localVenda != null && localVenda.length() >0) {
		
		Venda venda = new Venda(idVenda, vendedor, veiculo,precoVenda, localVenda);
		venda.cadastrarVenda(venda);
		return true;
		}
		
		return false;
	}
	
	public void mudarVenda() {
		
	}
}
