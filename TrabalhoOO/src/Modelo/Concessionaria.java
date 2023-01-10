package Modelo;

import java.util.ArrayList;

public class Concessionaria {
	private String nome;
	private int capacidade;
	private int numVendedores;
	private String endConcessionaria;
	private ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();


	public Concessionaria(String nome, int capacidade, int numVendedores, String endConcessionaria,
			ArrayList<Veiculo> listaVeiculos) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.numVendedores = numVendedores;
		this.endConcessionaria = endConcessionaria;
		this.listaVeiculos = listaVeiculos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumVendedores() {
		return numVendedores;
	}
	public void setNumVendedores(int numVendedores) {
		this.numVendedores = numVendedores;
	}
	
	public String getEndConcessionaria() {
		return endConcessionaria;
	}
	public void setEndConcessionaria(String endConcessionaria) {
		this.endConcessionaria = endConcessionaria;
	}

	public ArrayList<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}


	
	public void adicionarVeiculo(Veiculo veiculo){
		listaVeiculos.add(veiculo);
		
	}
	
	public void removerViculo(Veiculo veiculo) {
		this.listaVeiculos.remove(veiculo);
			
	}

	@Override
	public String toString() {
		return "CONCESSIONARIA"  + " " + 
				"|"	+ "Nome da Concessionaria:" + " " + nome +
				"|"	+ "Capacidade de Veiculos :" + " " + capacidade + 
				"|"	+"Numero de Vendedores :" + " " + numVendedores +
				"|" +"Endereco Concessionaria" + " " + endConcessionaria + 
				"|" + "Lista de Veiculos no estabelecimente: " + listaVeiculos;
	}

}