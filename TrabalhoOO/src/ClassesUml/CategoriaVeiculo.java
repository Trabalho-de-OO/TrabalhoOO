package ClassesUml;

public class CategoriaVeiculo {
	private String nome;
	
	public CategoriaVeiculo(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	
	public String toString() {
		return nome;
	}
}