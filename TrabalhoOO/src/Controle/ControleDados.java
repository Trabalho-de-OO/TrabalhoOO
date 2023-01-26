package Controle;
import java.util.ArrayList;
import java.util.List;

import Modelo.*;

public class ControleDados {
	private Dados controleDados = new Dados();


	public ControleDados(){
		controleDados.dadosProntos();
	}

	//Getts e setts
	public Dados getDados() {
		return controleDados;
	}

	public void setD(Dados d) {
		this.controleDados = d;
	}


	public ArrayList<Veiculo> getDadosListaVeiculo() {
		return controleDados.getDadosListaVeiculo();
	}
	public ArrayList<Venda> getDadosListaVenda(){
		
		return controleDados.getDadosListaVenda();
	}

	/*
	public boolean cadastrarVeiculo(String [] dadosVeiculo) {


		if(!dadosVeiculo[2].matches("[0-9] +")|| !dadosVeiculo[4].matches("[0-9]+") ||!dadosVeiculo[5].matches("[0-9 ]+")||!dadosVeiculo[6].matches("[0-9]+"))  {
			return false;

		}else {
			Veiculo v = new Veiculo(dadosVeiculo[1],Integer.parseInt(dadosVeiculo[2]) ,dadosVeiculo[3],Integer.parseInt(dadosVeiculo[4]),Integer.parseInt(dadosVeiculo[5]),
					Integer.parseInt(dadosVeiculo[6]),dadosVeiculo[7],dadosVeiculo[8],dadosVeiculo[9]);
			controleDados.cadastrarVeiculo(v, Integer.parseInt(dadosVeiculo[0]), controleDados);

			return true;
		}



	}	




	public boolean removerVeiculo(int posicaoVeiculo) {

		String v = controleDados.getDadosListaVeiculo().toString();

		if(v.contains(controleDados.getDadosListaVeiculo().get(posicaoVeiculo).getNomeVeiculo())) {
			return false;
		} else { controleDados.getDadosListaVeiculo().remove(posicaoVeiculo);
		return true;


		}



	}
	 */


	public boolean cadastrarVeiculo(String [] dadosVeiculo) {

		if (!dadosVeiculo[2].matches("\\d{4}") || !dadosVeiculo[4].matches("\\d") || !dadosVeiculo[5].matches("[2-4]")
				|| !dadosVeiculo[6].matches("[1-9][0-9]{3,6}") || !dadosVeiculo[7].matches("[0-9][0-9]{0,4}")){
			return false;
		}else {
			Veiculo v = new Veiculo(dadosVeiculo[1],Integer.parseInt(dadosVeiculo[2]) ,dadosVeiculo[3],Integer.parseInt(dadosVeiculo[4]),Integer.parseInt(dadosVeiculo[5]),
					Integer.parseInt(dadosVeiculo[6]),Integer.parseInt(dadosVeiculo[7]),dadosVeiculo[8],dadosVeiculo[9]);

			controleDados.cadastrarVeiculo(v, controleDados, Integer.parseInt(dadosVeiculo[0]));
			return true;				
		} 
	}
	
	

	public boolean cadastrarVenda(String [] dadosVenda) {
		
		if(!dadosVenda[1].matches("\\d{5}") || !dadosVenda[4].matches("[1-9][0-9]{3,6}")) {
			return false;
			
		}else {
			Venda vd = new Venda(Integer.parseInt(dadosVenda[1]), dadosVenda[2], dadosVenda[3], Integer.parseInt(dadosVenda[4]),
					dadosVenda[5]);
			controleDados.cadastrarVenda(vd, controleDados, Integer.parseInt(dadosVenda[0]));
			return true;
		}
		

	}
	
	


	
	public boolean removerVeiculo(int posicao) {
		String veiculos = controleDados.getDadosListaVeiculo().toString();
		
		if(veiculos.contains(controleDados.getDadosListaVeiculo().get(posicao).getNomeVeiculo())) {
		
			return false;
		}else {
			controleDados.getDadosListaVeiculo().remove(posicao);
			return true;
		}
	}

}	