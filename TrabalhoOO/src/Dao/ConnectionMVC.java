package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  Classe para fazer a conexão do banco de dados com a 
 *  classe de conexão Data Access Object 
 * @author Doan Filho
 * @since 2023
 *
 */
public class ConnectionMVC {

	/**
	 * Conexão de banco de dados(MySql) com a classe
	 * Data Access Object
	 * @return conexao
	 */

	public Connection getConnection() {

		Connection conn = null;


		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		}catch(ClassNotFoundException e ) {
			e.printStackTrace();
		}
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc?userSSL=false","root","@rootdg140802");

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;


	}


}
