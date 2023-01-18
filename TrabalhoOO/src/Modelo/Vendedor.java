package Modelo;

public class Vendedor extends Pessoa{
	//atributos vendedor
	private int comissao;

	public Vendedor() {
		super();
	}
	public Vendedor(String nome, String email, int telefone, String cpf,
			String endereco,int comissao) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.comissao = comissao;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	@Override

	public String toString() {
		return  "\n" + "--VENDEDOR--\n" 
				 + "NOME  : " + nome + "\n"
				 + "EMAIL : " + email + "\n"
				 + "TELEFONE : " + telefone + "\n" 
				 + "CPF : " + cpf + "\n"
				 + "ENDERECO : " + endereco + "\n"
				 + "COMISSAO : " + comissao + "\n" + "\n";


	}

}