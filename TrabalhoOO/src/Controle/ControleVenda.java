package Controle;

import java.util.ArrayList;

import Dao.ExceptionDAO;
import Modelo.Veiculo;
import Modelo.Venda;

/**
 * 
 * Classe reponsável por tratar os dados da modelo e fazer a mediação da 
 * modelo com a visualização
 * 
 * @author Doan Filho
 * @since 2023 
 * 
 *
 */

public class ControleVenda {

	private Venda venda ;

	public ControleVenda() {

	}	
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	/**
	 * 
	 * Método para cadastrar a venda de acordo com a 
	 * validação especificada no if
	 * 
	 * @param vendedor
	 * @param veiculo
	 * @param precoVenda
	 * @param localVenda
	 * @return boolean
	 * @throws ExceptionDAO
	 */


	public boolean cadastrarVendas(String vendedor, String veiculo, int precoVenda,String localVenda) throws ExceptionDAO {

		if( vendedor  != null && vendedor.length() > 0 &&  veiculo != null && veiculo.length() > 0 &&
				precoVenda >= 3000 && localVenda != null && localVenda.length() >0) {

			Venda venda = new Venda( vendedor, veiculo,precoVenda, localVenda);
			venda.cadastrarVenda(venda);
			return true;
		}

		return false;
	}

	/**
	 * Método para consultar as vendas cadastradas no banco de dados  
	 * pelo nome do vendedor  
	 * 
	 * @param vendedor
	 * @return Venda
	 * @throws ExceptionDAO
	 */
	public ArrayList<Venda> consultarVendas( String vendedor) throws ExceptionDAO{
		return new Venda().consultarVenda(vendedor);
	}	

	/**
	 * Método para mudar os dados cadastrados no banco de dados 
	 * 
	 * @param codVenda
	 * @param vendedor
	 * @param veiculo
	 * @param precoVenda
	 * @param localVenda
	 * @return boolean
	 * @throws ExceptionDAO
	 */

	public boolean mudarVenda(int codVenda, String vendedor, String veiculo, int precoVenda,String localVenda) throws ExceptionDAO {

		if( vendedor  != null && vendedor.length() > 0 &&  veiculo != null && veiculo.length() > 0 &&
				precoVenda >= 3000 && localVenda != null && localVenda.length() >0) {

			Venda venda = new Venda( vendedor, veiculo,precoVenda, localVenda);
			venda.setCodVenda(codVenda);
			venda.mudarVenda(venda);
			return true;
		}
		return false;

	}
	/**
	 * Método para apagar os dados cadastrados no banco de dados 
	 *  
	 * @param codVenda
	 * @return
	 * @throws ExceptionDAO
	 */

	public boolean apagarVenda(int codVenda) throws ExceptionDAO {
		if(codVenda == 0) {
			return false;

		}else {
			Venda venda = new Venda();
			venda.setCodVenda(codVenda);
			venda.apagarVenda(venda);
			return true;
		}




	}
}