package Modelo;

import java.util.Calendar;
import java.util.Date;

public class Dados {
	private  Comprador[] dadosComprador = new Comprador[100];
	private int quantComprador = 0;
	private Vendedor[] dadosVendedor = new Vendedor[100];
	private int quantVendedor = 0;
	private Venda[] dadosVenda = new Venda[100];
	private int quantVenda = 0;
	private Concessionaria[] dadosConcessionaria = new Concessionaria[100];
	private int quantConcessionaria = 0;


	public void fiiWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		
		for( int i = 0; i < 2; i++) {

			dadosComprador[i] = new Comprador("RenatoCariane",
			"Renatin@gmailcom",554544,"032565525","Sao Paulo", 900.000,"Audi x6");

		}
		quantComprador = 2;
	}


	public Comprador[] getDadosComprador() {
		return dadosComprador;
	}


	public void setDadosComprador(Comprador[] dadosComprador) {
		this.dadosComprador = dadosComprador;
	}


	public int getQuantComprador() {
		return quantComprador;
	}


	public void setQuantComprador(int quantComprador) {
		this.quantComprador = quantComprador;
	}


	public Vendedor[] getDadosVendedor() {
		return dadosVendedor;
	}


	public void setDadosVendedor(Vendedor[] dadosVendedor) {
		this.dadosVendedor = dadosVendedor;
	}


	public int getQuantVendedor() {
		return quantVendedor;
	}


	public void setQuantVendedor(int quantVendedor) {
		this.quantVendedor = quantVendedor;
	}


	public Venda[] getDadosVenda() {
		return dadosVenda;
	}


	public void setDadosVenda(Venda[] dadosVenda) {
		this.dadosVenda = dadosVenda;
	}


	public int getQuantVenda() {
		return quantVenda;
	}


	public void setQuantVenda(int quantVenda) {
		this.quantVenda = quantVenda;
	}


	public Concessionaria[] getDadosConcessionaria() {
		return dadosConcessionaria;
	}


	public void setDadosConcessionaria(Concessionaria[] dadosConcessionaria) {
		this.dadosConcessionaria = dadosConcessionaria;
	}


	public int getQuantConcessionaria() {
		return quantConcessionaria;
	}


	public void setQuantConcessionaria(int quantConcessionaria) {
		this.quantConcessionaria = quantConcessionaria;
	}
	
}