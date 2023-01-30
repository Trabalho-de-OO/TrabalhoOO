package Dao;
/**
 * Classe  herdada de Exception para tratar as exceções do pacote Data Access Object 
 * @author Doan Filho
 *@since 2023
 */
public class ExceptionDAO extends Exception{

	/**
	 * Realizar a mensagem das exceptions
	 * @param mensagem
	 */
	public ExceptionDAO (String mensagem) {

		super(mensagem);
	}


}
