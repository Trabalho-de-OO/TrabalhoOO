package Modelo;

public class Veiculo {
	private String nomeVeiculo;
	private int ano;
	private String cor;
	private int finalPlaca;
	private int numPortas;
	private double preco;
	private String quilometragem;
	private String categoria;
	private String marca;
	
	public Veiculo(String nomeVeiculo, int ano,String cor,int finalPlaca, int numPortas, Double preco,String quilometragem,String categoria, String marca) {
		this.nomeVeiculo = nomeVeiculo;
		this.ano = ano;
		this.cor = cor;
		this.finalPlaca = finalPlaca;
		this.numPortas = numPortas;
		this.preco= preco;
		this.quilometragem = quilometragem;		
		this.categoria = categoria;
		this.marca = marca;
	}
	
	public String getNomeVeiculo() {
		return nomeVeiculo;		
	}
	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getFinalPlaca() {
		return finalPlaca;
	}

	public void setFinalPlaca(int finalPlaca) {
		this.finalPlaca = finalPlaca;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
@Override

public String toString(){
	return "VEICULO" + " " +
"|" + "NomeVeiculo:"+ nomeVeiculo +
"|"	+ "Ano :" + ano + 
"|" + "Cor :" + cor + 
"|" + "Numero final da placa :"+ finalPlaca + 
"|" + "Numero de Portas :" + numPortas + 
"|" + "Preco do Carro :" + preco +
"|" + "Kms Rodados:" + quilometragem +
"|"	+ "Categoria : " + categoria +
"|" + "Marca : " + marca;
	
}

}
