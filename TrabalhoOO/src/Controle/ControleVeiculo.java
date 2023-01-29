package Controle;
import java.util.ArrayList;
import java.util.List;

import Dao.ExceptionDAO;
import Modelo.Veiculo;

public class ControleVeiculo {
	
	private Veiculo veiculo = new Veiculo();
	
	public ControleVeiculo() {
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}




	public boolean cadastrarVeiculo(String nomeVeiculo, int ano, String cor, int finalPlaca,
			int numPortas, int preco, int  quilometragem, String categoria, String marca) throws ExceptionDAO{
		
		if(nomeVeiculo != null && nomeVeiculo.length() > 0 && ano > 0 && cor != null && cor.length() >0 &&
				 finalPlaca >= 0 && numPortas >0 && preco >= 3000 &&  quilometragem >= 0
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

	public ArrayList<Veiculo> consultarVeiculoPreco(int preco) throws ExceptionDAO{
		
		return new Veiculo().consultarVeiculoPreco(preco);
		
	}
	public boolean mudarVeiculo(int codVeiculo,String nomeVeiculo, int ano, String cor, int finalPlaca,
			int numPortas, int preco, int  quilometragem, String categoria, String marca) throws ExceptionDAO{
		
		if(nomeVeiculo != null && nomeVeiculo.length() > 0 && ano > 0 && cor != null && cor.length() >0 &&
				 finalPlaca >= 0 && numPortas > 1 && preco >= 3000 &&  quilometragem >= 0
				&& categoria != null && categoria.length() > 0 && marca!= null && marca.length() > 0) {
		
			Veiculo veiculo = new Veiculo(nomeVeiculo, ano, cor, finalPlaca,numPortas,preco,quilometragem,
				categoria, marca);
		veiculo.setCodVeiculo(codVeiculo);
		veiculo.mudarVeiculo(veiculo);
		return true;
		}
		return false;
	}
	
	public boolean apagarVeiculo(int codVeiculo) throws ExceptionDAO {
		if(codVeiculo == 0) {
			return false;
			
		}else {
			Veiculo veiculo = new Veiculo();
			veiculo.setCodVeiculo(codVeiculo);
			veiculo.apagarVeiculo(veiculo);
			return true;
		}
		
		
		
		
	}
	
}	
	

	