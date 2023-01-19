package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
	private String nome;
	private int capacidade;
	private int numVendedores;
	private String endConcessionaria;
	private List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
	private int numeroVeiculos = 0;


	public Concessionaria(String nome, int capacidade, int numVendedores,String endConcessionaria) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
		this.numVendedores = numVendedores;
		this.endConcessionaria = endConcessionaria;

	}

	public Concessionaria(List<Veiculo> listaVeiculos) {
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

	public List<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(List<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	public int getNumeroVeiculos() {
		return numeroVeiculos;
	}

	public void setNumeroVeiculos(int numeroVeiculos) {
		this.numeroVeiculos = numeroVeiculos;
	}

	public void buscarVeiculo( List<Veiculo> listaVeiculos, Veiculo veiculo) {

		if(listaVeiculos.contains(veiculo) == true) {

			System.out.format("Veiculo buscado foi : %s\n Ano : %d\n Numero Final da Placa : %d",
					veiculo.getNomeVeiculo(), veiculo.getAno(), veiculo.getFinalPlaca());
		} else {

			System.out.print("--ERROR-- \n Nao ha esse veiculo na lista");
		}

	}



	@Override
	public String toString() {
		return 	 "--CONCESSIONARIA--\n" 
				+ "NOME DA CONCESSIONARIA : " + nome + "\n"  
				+ "CAPACIDADE DE VEICULOS : " + capacidade + "\n" 
				+ "NUMERO DE VENDEDORES : "   + numVendedores + "\n" 
				+ "ENDERECO CONCESSIONARIA : " + endConcessionaria + "\n" + "\n" ;
	}
}

