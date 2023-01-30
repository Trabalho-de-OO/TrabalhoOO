package Modelo;

import java.util.ArrayList;

import Dao.ExceptionDAO;
import Dao.VeiculoDAO;
import Dao.VendaDAO;
/**
 * Classe para representar venda que faz interação com a controle
 * e com a classe DAO para requerir métodos relacionados ao banco de 
 * dados
 * 
 * @author Doan Filho
 *
 */

public class Venda {
	
	private int codVenda;
	private String vendedor;
	private String veiculo;
	private int precoVenda;
	private String localVenda;
	
	/**
	 * Construtor vazio para requisições especificas
	 * 
	 */
	
	public Venda() {
		
	}
	/**
	 * Construtor com parâmetros para requisições
	 * 
	 * @param vendedor
	 * @param veiculo
	 * @param precoVenda
	 * @param localVenda
	 */
	public Venda( String vendedor, String  veiculo, int precoVenda, 
			String localVenda) {
		this.vendedor = vendedor;
		this.veiculo = veiculo;
		this.precoVenda = precoVenda;
		this.localVenda = localVenda;
	}
	
	
	public int getCodVenda() {
		return codVenda;
	}
	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public String getVendedor() {
		return vendedor;
	}


	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}


	public String getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}


	public  int getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(int  d) {
		this.precoVenda = d;
	}
	
	public String getLocalVenda() {
		return localVenda;
	}

	public void setLocalVenda(String localVenda) {
		this.localVenda = localVenda;
	}
	
	/**
	 * Método para cadastrar uma venda requerida pelo usuário
	 * @param venda
	 * @throws ExceptionDAO
	 */

	public void cadastrarVenda(Venda venda) throws ExceptionDAO{
		
	new VendaDAO().cadastrarVenda(venda);
	
	}
	
	/**
	 * Método para listar vendas por nome de vendedor
	 * 
	 * @param marca
	 * @return ArrayList
	 * @throws ExceptionDAO
	 */
	
	
	public ArrayList<Venda> consultarVenda(String vendedor) throws ExceptionDAO{
		return new VendaDAO().consultarVenda(vendedor);
	}	
	/**
	 * 	
	/**
	 * Método para a mudar venda no banco de acordo com o requerimento
	 * do usuário
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */

	
	
	public void mudarVenda(Venda venda) throws ExceptionDAO{
		new VendaDAO().mudarVenda(venda);
	}
	
	/**
	 * Método para apagar venda no banco de dados de acordo com
	 * o requerimento do usuário
	 * 
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */
	
public void apagarVenda(Venda venda) throws ExceptionDAO{
	
	new VendaDAO().apagarVenda(venda);
	
}	
	


	@Override
	public String toString() {
		return "\n" + "--VENDA--\n" 				
				 + "NOME DO VENDEDOR : " + vendedor + "\n"
				 + "VEICULO : " + veiculo + "\n"
				 + "PRECO DA VENDA : " + precoVenda + "\n" 
				 + "LOCAL DA VENDA: " + localVenda + "\n";
	}

	
}



