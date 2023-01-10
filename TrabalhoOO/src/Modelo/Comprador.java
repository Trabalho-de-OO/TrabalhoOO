package Modelo;


public class Comprador extends Pessoa {
	private double saldo;
	private String veiculoDesejado;

	public Comprador() {
		super();
	}
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
		return "COMPRADOR"+ " " +
				"|" +"Nome :" + nome + 
				"|" + "Email :" + email + 
				"|" + "Numero de Telefone :"+ telefone + 
				"|" + "CPF : " + cpf + 
				"|" + "Endereco :" + endereco +
				"|" + "Valor Saldo :" + saldo +
				"|" + "Carro Desejado :" + veiculoDesejado;

	}
}
