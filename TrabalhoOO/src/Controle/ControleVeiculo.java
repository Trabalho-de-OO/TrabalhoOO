package Controle;
import java.util.ArrayList;
import java.util.List;

import Dao.ExceptionDAO;
import Modelo.Veiculo;

public class ControleVeiculo {
	
	private List<Veiculo> veiculosProntos;
	private Veiculo veiculo = new Veiculo();
	
	public ControleVeiculo() {
	}
	public ControleVeiculo(ControleDados dados) {
		veiculosProntos = dados.getDadosListaVeiculo();	
	}
	public List<Veiculo> getVeiculosProntos() {
		return veiculosProntos;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculosProntos(List<Veiculo> veiculosProntos) {
		this.veiculosProntos = veiculosProntos;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	
	public boolean cadastrarVeiculo(String nomeVeiculo, int ano, String cor, int finalPlaca,
			int numPortas, int preco, int  quilometragem, String categoria, String marca) throws ExceptionDAO{
		
		if(nomeVeiculo != null && nomeVeiculo.length() > 0 && ano > 0 && cor != null && cor.length() >0 &&
				 finalPlaca > 0 && numPortas > 1 && preco > 0 &&  quilometragem > 0
				&& categoria != null && categoria.length() > 0 && marca!= null && marca.length() > 0) {
		
		Veiculo veiculo = new Veiculo(nomeVeiculo, ano, cor, finalPlaca,numPortas,preco,quilometragem,
				categoria, marca);
		
		veiculo.cadastrarVeiculo(veiculo);
		return true;
		}
		return false;
	}
	
	public ArrayList<Veiculo> consultarVeiculo(String marca) throws ExceptionDAO{
		
		return new Veiculo().consultarVeiculo(marca);
		
	}
	public boolean mudarVeiculo(int codVeiculo,String nomeVeiculo, int ano, String cor, int finalPlaca,
			int numPortas, int preco, int  quilometragem, String categoria, String marca) throws ExceptionDAO{
		
		if(nomeVeiculo != null && nomeVeiculo.length() > 0 && ano > 0 && cor != null && cor.length() >0 &&
				 finalPlaca > 0 && numPortas > 1 && preco > 0 &&  quilometragem > 0
				&& categoria != null && categoria.length() > 0 && marca!= null && marca.length() > 0) {
		
			Veiculo veiculo = new Veiculo(nomeVeiculo, ano, cor, finalPlaca,numPortas,preco,quilometragem,
				categoria, marca);
		veiculo.setCodVeiculo(codVeiculo);
		veiculo.mudarVeiculo(veiculo);
		return true;
		}
		return false;
	}
	
	
	
	public String[] getListaVeiculosProntos() {
		String[] listaVeiculo = new String[veiculosProntos.size()];
		int i;
		for(i = 0; i < veiculosProntos.size(); i++) {
			listaVeiculo[i] = (veiculosProntos.get(i).getNomeVeiculo());
		}
		return listaVeiculo;
	}
}
	