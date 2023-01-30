package Modelo;

/**
 * Classe para representar um comprador quer herda atributos da 
 * classe Pessoa 
 * 
 * @author Doan Filho
 * @since 2022
 */
public class Comprador extends Pessoa {
	private double saldo;
	private String veiculoDesejado;
	
	/**
	 *
	 * Construtor vazio para requisições especificas
	 * 
	 */

	public Comprador() {
		super();
	}
	
	/**
	 * 
	 * Construtor com parâmetros para requisições 
	 * 
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param cpf
	 * @param endereco
	 * @param saldo
	 * @param veiculoDesejado
	 */
	
	public Comprador(String nome, String email, int telefone, String cpf, String endereco,double saldo, String veiculoDesejado) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.saldo = saldo;
		this.veiculoDesejado = veiculoDesejado;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getVeiculoDesejado() {
		return veiculoDesejado;
	}
	public void setVeiculoDesejado(String veiculoDesejado) {
		this.veiculoDesejado = veiculoDesejado;
	}
	
	
	public String toString() {
		return "--COMPRADOR--\n"+ "NOME : "+ nome + "\n"
			 + "EMAIL : " + email +"\n" 
			 + "TELEFONE : " + telefone + "\n"
			 + "CPF : " + cpf + "\n"
			 + "ENDERECO : " + endereco + "\n"
			 + "SALDO : " + saldo + "\n" 
			 + "VEICULO DESEJADO : " + veiculoDesejado + "\n" + "\n"; 
			

	}
}
