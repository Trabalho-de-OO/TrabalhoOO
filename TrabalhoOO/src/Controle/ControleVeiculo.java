package Controle;
import java.util.List;


import Modelo.Veiculo;

public class ControleVeiculo {
	
	private List<Veiculo> veiculosProntos;
	
	private Veiculo veiculo = new Veiculo();
	
	public ControleVeiculo() {}
	
	public ControleVeiculo(ControleDados dados) {
		veiculosProntos = dados.getDadosVeiculo();
		
		
				
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

	
	

	public String[] getListaVeiculosProntos() {
		String[] listaVeiculo = new String[veiculosProntos.size()];
		int i;
		for(i = 0; i < veiculosProntos.size(); i++) {
			listaVeiculo[i] = (veiculosProntos.get(i).getNomeVeiculo());
		}
		return listaVeiculo;
	}
	 
}
