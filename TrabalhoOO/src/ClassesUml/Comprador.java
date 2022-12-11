package ClassesUml;

public class Comprador extends Pessoa {
	private double valDesejado; 
	 
	public Comprador(String nome, String email, int telefone, String cpf, String endereco, double valDesejado) {
		super(nome, email, telefone, cpf, endereco);
		this.valDesejado = valDesejado;
	}

	public double getValDesejado() {
		return valDesejado;
	}

	public void setValDesejado(double valDesejado) {
		this.valDesejado = valDesejado;
	}
}
