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


	public ArrayList<Veiculo> getDadosVeiculo() {
		return controleDados.getDadosListaVeiculo();
	}

	public ArrayList<Venda> getDadosVendas(){
		return controleDados.getDadosVenda();
	}


	//metodo para pegar os dados prontos para a JList
	public void pegarDadosProntos() {
		controleDados.dadosProntos();

	}


	public boolean cadastrarVeiculo(String [] dadosVeiculo) {


		if(!dadosVeiculo[2].matches("[0-9] +")|| !dadosVeiculo[4].matches("[0-9]+") ||!dadosVeiculo[5].matches("[0-9 ]+")||!dadosVeiculo[6].matches("[0-9]+"))  {
			return false;

		}else {
			Veiculo v = new Veiculo(dadosVeiculo[1],Integer.parseInt(dadosVeiculo[2]) ,dadosVeiculo[3],Integer.parseInt(dadosVeiculo[4]),Integer.parseInt(dadosVeiculo[5]),
					Integer.parseInt(dadosVeiculo[6]),dadosVeiculo[7],dadosVeiculo[8],dadosVeiculo[9]);		
			return true;
		}

	}
	
	public boolean cadastrarVenda(String [] dadosVenda) {


		if(!dadosVenda[1].matches("[0-9] +")|| !dadosVenda[4].matches("[0-9] + "))  {
			return false;

		}else {
			Venda vend = new Venda(Integer.parseInt(dadosVenda[1]),dadosVenda[2] ,dadosVenda[3],
					Integer.parseInt(dadosVenda[4]), dadosVenda[5]);
			return true;
		}



	}

}	

















