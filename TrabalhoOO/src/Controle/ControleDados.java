package Controle;
import java.util.ArrayList;

import Modelo.*;

public class ControleDados {
	private Dados dados = new Dados();

	public ControleDados() {
		dados.dadosProntos();
	}

	public Dados getDados() {
		return dados;
	}

	public void setD(Dados d) {
		this.dados = d;
	}

	
	public ArrayList<Veiculo> getDadosVeiculo() {
		return dados.getDadosVeiculo();
	}
	
	public ArrayList<Venda> getDadosVendas(){
		return dados.getDadosVenda();
	}
}	

















