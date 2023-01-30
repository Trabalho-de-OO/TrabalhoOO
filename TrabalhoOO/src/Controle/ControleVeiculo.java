package Controle;
import java.util.ArrayList;
import java.util.List;

import Dao.ExceptionDAO;
import Modelo.Veiculo;

/**
 * Classe reponsável por tratar os dados da modelo e fazer a mediação da 
 * modelo com a visualização
 * 
 * @author Doan Filho
 * @since 2023
 *
 */
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


	/**
	 * Método para cadastrar o veiculo  de acordo com a 	
	 * validação especificada no if
	 * 
	 * @param nomeVeiculo
	 * @param ano
	 * @param cor
	 * @param finalPlaca
	 * @param numPortas
	 * @param preco
	 * @param quilometragem
	 * @param categoria
	 * @param marca
	 * @return boolean
	 * @throws ExceptionDAO
	 */

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
	/**
	 * Método para consultar os veiculos cadastrados no banco de dados  
	 * pela marca  
	 * 
	 * @param marca
	 * @return boolean
	 * @throws ExceptionDAO
	 */
	public ArrayList<Veiculo> consultarVeiculo(String marca) throws ExceptionDAO{

		return new Veiculo().consultarVeiculo(marca);

	}
	/**
	 * *
	 * Método para consultar os veiculos cadastrados no banco de dados  
	 * pelo preço
	 * 
	 * @param preco
	 * @return veiculo
	 * @throws ExceptionDAO
	 */
	public ArrayList<Veiculo> consultarVeiculoPreco(int preco) throws ExceptionDAO{

		return new Veiculo().consultarVeiculoPreco(preco);

	}

	/**
	 * Método para mudar os dados cadastrados no banco de dados 
	 * 
	 * @param codVeiculo
	 * @param nomeVeiculo
	 * @param ano
	 * @param cor
	 * @param finalPlaca
	 * @param numPortas
	 * @param preco
	 * @param quilometragem
	 * @param categoria
	 * @param marca
	 * @return boolean
	 * @throws ExceptionDAO
	 */
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
	/**
	 * Método para apagar os dados cadastrados no banco de dados 
	 * 
	 * @param codVeiculo
	 * @return boolean
	 * @throws ExceptionDAO
	 * 
	 */
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


