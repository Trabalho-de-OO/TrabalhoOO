package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.Veiculo;
import Modelo.Venda;

public class VendaDAO {

	public void cadastrarVenda(Venda venda) throws ExceptionDAO{
		String sql ="insert into venda( vendedor, veiculo ,precoVenda, localVenda) "
				+ "value(?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, venda.getVendedor());
			pStatement.setString(2, venda.getVeiculo());
			pStatement.setInt(3,venda.getPrecoVenda() );
			pStatement.setString(4, venda.getLocalVenda());		
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
	public ArrayList<Venda> consultarVenda(String vendedor) throws ExceptionDAO{
		String sql = "select * from VENDA where vendedor like '%" + vendedor + "%' order by vendedor ";
		
		Connection connection = null;
		PreparedStatement pStatement = null;
		ArrayList<Venda> listaVenda = null;
		
		try {
			
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			ResultSet rest = pStatement.executeQuery(sql);
			
			if(rest!= null) {
				listaVenda= new ArrayList<Venda>();
				while (rest.next()) {
					Venda venda = new Venda();
					venda.setCodVenda(rest.getInt("codVenda"));
					venda.setVendedor(rest.getString("vendedor"));
					venda.setVeiculo(rest.getString("veiculo"));
					venda.setPrecoVenda(rest.getInt("precoVenda"));
					venda.setLocalVenda(rest.getString("localVenda"));
					listaVenda.add(venda);
				}
			}
			
			
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao consultar Venda" + e);
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
		return listaVenda;
	}
	public void mudarVenda(Venda venda) throws ExceptionDAO {
		String sql = "Update VENDA set vendedor = ?, veiculo = ?, precoVenda = ?, localVenda = ? where codVenda = ?";
		PreparedStatement pStatement = null;
		Connection connection = null;
		
		try {
			
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, venda.getVendedor());
			pStatement.setString(2, venda.getVeiculo());
			pStatement.setInt(3, venda.getPrecoVenda());
			pStatement.setString(4, venda.getLocalVenda());
			pStatement.setInt(5, venda.getCodVenda());
			pStatement.execute();
			
		}catch(SQLException e) {
			throw new ExceptionDAO("Erro ao modificar Venda" + e);
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
	public void apagarVenda(Venda venda) throws ExceptionDAO{

		String sql ="Delete From VENDA where codVenda = ?";
		PreparedStatement pStatement = null;
		Connection connection = null;

		try {
			connection = new ConnectionMVC().getConnection();
			pStatement = connection.prepareStatement(sql);
			pStatement.setInt(1, venda.getCodVenda());
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