package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.Veiculo;

public class VeiculoDAO {

	public void cadastrarVeiculo(Veiculo veiculo) throws ExceptionDAO{


		String sql ="insert into veiculo(nomeveiculo, ano, cor, finalPlaca, numPorta,preco,categoria,marca) "
				+ "value(?,? ,? ,? ,? ,?,?,?)";
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
			pStatement.setString(7, veiculo.getCategoria());
			pStatement.setString(8, veiculo.getMarca());
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
}