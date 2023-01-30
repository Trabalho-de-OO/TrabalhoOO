package Modelo;

import java.util.ArrayList;

import Dao.ExceptionDAO;
import Dao.VeiculoDAO;
/**
 * Classe para representar veiculo que faz interação com a controle
 * e com a classe DAO para requerir métodos relacionados ao banco de 
 * dados
 * 
 * @author Doan Filho
 * @since 2022
 */

public class Veiculo {
	private int codVeiculo;
	private String nomeVeiculo;
	private int ano;
	private String cor;
	private int finalPlaca;
	private int numPortas;
	private int preco;
	private int quilometragem;
	private String categoria;
	private String marca;
	
	/**
	 * Construtor vazio para requisições especificas
	 */
	
	public Veiculo() {
	}
	
	/**
	 * Construtor com parâmetros para requisições
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
	 */
	
	public Veiculo(String nomeVeiculo, int ano, String cor,int finalPlaca,
			int numPortas,int preco, int quilometragem,String categoria, String marca) {
	
		this.nomeVeiculo = nomeVeiculo;
		this.ano = ano;
		this.cor = cor;
		this.finalPlaca = finalPlaca;
		this.numPortas = numPortas;
		this.preco = preco;
		this.quilometragem = quilometragem;		
		this.categoria = categoria;
		this.marca = marca;
	}
	public int getCodVeiculo() {
		return codVeiculo;
	}
	
	public void setCodVeiculo(int codVeiculo) {
		this.codVeiculo = codVeiculo;
	}
	
	
	public String getNomeVeiculo() {
		return nomeVeiculo;		
	}
	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getFinalPlaca() {
		return finalPlaca;
	}

	public void setFinalPlaca(int finalPlaca) {
		this.finalPlaca = finalPlaca;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	// cadastro e remover 
	
	/**
	 * Método para cadastrar um veiculo requerido pelo usuário
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */
	
	public void cadastrarVeiculo(Veiculo veiculo) throws ExceptionDAO{
		
	new VeiculoDAO().cadastrarVeiculo(veiculo);
	
	}
	
	/**
	 * Método para listar veiculos por determinado preço
	 * 
	 * @param preco
	 * @return ArrayList
	 * @throws ExceptionDAO
	 */
	public ArrayList<Veiculo> consultarVeiculoPreco(int preco) throws ExceptionDAO{
		return new VeiculoDAO().consultarVeiculoPreco(preco);
	}
	/**
	 * Método para listar veiculos por determinada marca
	 * 
	 * @param marca
	 * @return ArrayList
	 * @throws ExceptionDAO
	 */
	
	public ArrayList<Veiculo> consultarVeiculo(String marca) throws ExceptionDAO{
		return new VeiculoDAO().consultarVeiculo(marca);
	}
	
	/**
	 * Método para  a mudar veiculo no banco de acordo com o requerimento
	 * do usuário
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */

	public void mudarVeiculo(Veiculo veiculo) throws ExceptionDAO {
		 new VeiculoDAO().mudarVeiculo(veiculo);
	}
	
	/**
	 * Método para apagar veiculo no banco de dados de acordo com
	 * o requerimento do usuário
	 * 
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */

	public void apagarVeiculo(Veiculo veiculo) throws ExceptionDAO {
		 new VeiculoDAO().apagarVeiculo(veiculo);
	}
@Override

public String toString(){
	return"\n" + "--VEICULO--\n" 
		 + "NOME DO VEICULO : " + nomeVeiculo + "\n"
		 + "ANO : " + ano + "\n"
		 + "COR : " + cor + "\n" 
		 + "FINAL PLACA : " + finalPlaca + "\n"
		 + "NUMERO DE PORTAS : " + numPortas + "\n"
		 + "PRECO : " + preco + "\n" 
		 + "QUILOMETRAGEM : " + quilometragem + "\n"
		 + "CATEGORIA : " + categoria + "\n"
		 + "MARCA : " + marca + "\n";
		 
		
	
}

}
