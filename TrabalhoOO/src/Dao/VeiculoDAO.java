package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.ClientPreparedStatement;

import Modelo.Veiculo;

/**
 * Classe para efetuar a comunicação de dados do Banco de dados
 * com a modelo do Projeto
 * 
 * @author Doan Filho
 *@since 2023
 */
public class VeiculoDAO {
	/**
	 * Método para cadastrar um novo veiculo passando uma Query 
	 * para efetuar a solicitação para o banco
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */

	public void cadastrarVeiculo(Veiculo veiculo) throws ExceptionDAO{


		String sql ="insert into veiculo(nomeveiculo, ano, cor, finalPlaca, numPorta,preco,quilometragem,categoria,marca) "
				+ "value(?,? ,? ,? ,? ,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, veiculo.getNomeVeiculo());
			pStatement.setInt(2, veiculo.getAno());
			pStatement.setString(3, veiculo.getCor());
			pStatement.setInt(4, veiculo.getFinalPlaca());
			pStatement.setInt(5, veiculo.getNumPortas());
			pStatement.setInt(6, veiculo.getPreco());
			pStatement.setInt(7, veiculo.getQuilometragem());
			pStatement.setString(8, veiculo.getCategoria());
			pStatement.setString(9, veiculo.getMarca());
			pStatement.execute();
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao cadastrar" + e);
		} finally{

			try {

				if(pStatement != null ) {pStatement.close();}
			}catch(SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statement" + e);

			}	try {

				if(connection != null) {connection.close();}
			}catch(SQLException e) {
				throw new ExceptionDAO ("Erro ao fechar a conexão" + e);
			}
		}
	}
	
	/**
	 * Método para listar veiculos de acordo com o preço 
	 * requerido
	 * 
	 * @param preco
	 * @return ArrayList
	 * @throws ExceptionDAO
	 */
	
	public ArrayList<Veiculo> consultarVeiculoPreco(int preco) throws ExceptionDAO{
		String sql = "select * from VEICULO where preco like '%" + preco + "%' order by preco ";
		
		Connection connection = null;
		PreparedStatement pStatement = null;
		ArrayList<Veiculo> listaVeiculos = null;
		
		try {
			
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			ResultSet rest = pStatement.executeQuery(sql);
			
			if(rest!= null) {
				listaVeiculos= new ArrayList<Veiculo>();
				while (rest.next()) {
					Veiculo veiculo = new Veiculo();
					veiculo.setCodVeiculo(rest.getInt("codVeiculo"));
					veiculo.setNomeVeiculo(rest.getString("nomeveiculo"));
					veiculo.setAno(rest.getInt("ano"));
					veiculo.setCor(rest.getString("cor"));
					veiculo.setFinalPlaca(rest.getInt("finalPlaca"));
					veiculo.setNumPortas(rest.getInt("numPorta"));
					veiculo.setPreco(rest.getInt("preco"));
					veiculo.setQuilometragem(rest.getInt("quilometragem"));
					veiculo.setCategoria(rest.getString("categoria"));
					veiculo.setMarca(rest.getString("marca"));
					listaVeiculos.add(veiculo);
				}
			}
			
			
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao consultar Preço" + e);
		}finally {
			try {
				if(pStatement != null) {pStatement.close();}
				
			}catch(SQLException e ) {
				
				throw new ExceptionDAO("Erro ao fechar o pStatemente: " + e);
			}
			
		}
			try {
				if(connection!=null) {connection.close();}
				
			}catch(SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexao" + e);
				
			}
		return listaVeiculos;
	}
	
	/**
	 * Método para listar veiculos de acordo com a marca
	 * 
	 * @param marca
	 * @return ArrayList
	 * @throws ExceptionDAO
	 */
	public ArrayList<Veiculo> consultarVeiculo(String marca) throws ExceptionDAO{
		String sql = "select * from VEICULO where marca like '%" + marca + "%' order by marca ";
		
		Connection connection = null;
		PreparedStatement pStatement = null;
		ArrayList<Veiculo> listaVeiculos = null;
		
		try {
			
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			ResultSet rest = pStatement.executeQuery(sql);
			
			if(rest!= null) {
				listaVeiculos = new ArrayList<Veiculo>();
				while (rest.next()) {
					Veiculo veiculo = new Veiculo();
					veiculo.setCodVeiculo(rest.getInt("codVeiculo"));
					veiculo.setNomeVeiculo(rest.getString("nomeveiculo"));
					veiculo.setAno(rest.getInt("ano"));
					veiculo.setCor(rest.getString("cor"));
					veiculo.setFinalPlaca(rest.getInt("finalPlaca"));
					veiculo.setNumPortas(rest.getInt("numPorta"));
					veiculo.setPreco(rest.getInt("preco"));
					veiculo.setQuilometragem(rest.getInt("quilometragem"));
					veiculo.setCategoria(rest.getString("categoria"));
					veiculo.setMarca(rest.getString("marca"));
					listaVeiculos.add(veiculo);
				}
			}
			
			
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao consultar Veiculo" + e);
		}finally {
			try {
				if(pStatement != null) {pStatement.close();}
				
			}catch(SQLException e ) {
				
				throw new ExceptionDAO("Erro ao fechar o pStatemente: " + e);
			}
			
		}
			try {
				if(connection!=null) {connection.close();}
				
			}catch(SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexao" + e);
				
			}
		return listaVeiculos;
	}
	
	/**
	 * Método para mudar o veiculo previamente cadastrado
	 * no banco de acordo com o usuário
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */
	
	
	public void mudarVeiculo(Veiculo veiculo) throws ExceptionDAO {
		String sql = "Update VEICULO set nomeveiculo = ?, ano = ?, cor = ?, finalPlaca = ?, numPorta =?, preco = ?, quilometragem = ?, categoria = ?, marca =?  where codVeiculo = ?";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
			
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, veiculo.getNomeVeiculo());
			pStatement.setInt(2, veiculo.getAno());
			pStatement.setString(3, veiculo.getCor());
			pStatement.setInt(4, veiculo.getFinalPlaca());
			pStatement.setInt(5, veiculo.getNumPortas());
			pStatement.setInt(6, veiculo.getPreco());
			pStatement.setInt(7, veiculo.getQuilometragem());
			pStatement.setString(8, veiculo.getCategoria());
			pStatement.setString(9, veiculo.getMarca());
			pStatement.setInt(10, veiculo.getCodVeiculo());
			pStatement.execute();
			
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao modificar Veiculo" + e);
		}finally {
			try {
				if(pStatement != null) {pStatement.close();}
				
			}catch(SQLException e ) {
				
				throw new ExceptionDAO("Erro ao fechar o pStatemente: " + e);
			}
			
		}
			try {
				if(connection!=null) {connection.close();}
				
			}catch(SQLException e) {
				throw new ExceptionDAO("Erro ao fechar a conexao" + e);
				
			}
	}
	/**
	 * Método para apagar o resgistro de veiculo
	 * previamente cadastrado
	 * 
	 * @param veiculo
	 * @throws ExceptionDAO
	 */
	
	public void apagarVeiculo(Veiculo veiculo) throws ExceptionDAO{


		String sql ="Delete From VEICULO where codVeiculo = ?";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, veiculo.getCodVeiculo());
			pStatement.execute();
			
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao deletar" + e);
		} finally{

			try {

				if(pStatement != null ) {pStatement.close();}
			}catch(SQLException e) {
				throw new ExceptionDAO("Erro ao fechar o Statement" + e);

			}	try {

				if(connection != null) {connection.close();}
			}catch(SQLException e) {
				throw new ExceptionDAO ("Erro ao fechar a conexão" + e);
			}
		}
	}
}
