package ClassesUml;
public class Vendedor extends Pessoa{
	//atributos vendedor
	private int comissao;

	public Vendedor() {
		super();
	}
	public Vendedor(String nome, String email, int telefone, String cpf, String endereco,int comissao) {
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
		return "VENDEDOR" + " " +
"|"	+"Nome :" + nome + 
"|" + "Email :" + email + 
"|" + "Numero de Telefone :"+ telefone + 
"|" + "CPF : " + cpf + 
"|" + "Endereco :" + endereco +
"|" + "Valor Comissao: " + comissao; 


	}

}


