package Modelo;

import java.util.ArrayList;

public class Dados{

	private ArrayList<Comprador> dadosComprador = new ArrayList<>(); 
	private ArrayList<Vendedor> dadosVendedor = new ArrayList<>();
	private ArrayList<Veiculo> dadosVeiculo = new ArrayList<>();
	private ArrayList<Venda> dadosVenda = new ArrayList<>();
	private ArrayList<Concessionaria> dadosConcessionaria = new ArrayList<>();
	private ArrayList<String> dadosProntosLista = new ArrayList<>();

	
	
	//Dados pre cadastrados
	public void dadosProntos() {
		//Adição

		//dados Comprador 1
		dadosComprador.add(new Comprador("Nome Comprador1","Email Comprador1" ,
				00001,"Cpf1", "Endereco Comprador1" , 0.1 ,"Veiculo Desejado1"));

		// dados Comprador 2 	
		dadosComprador.add(new Comprador("Nome Comprador2","Email Comprador2" ,
				00002,"Cpf2", "Endereco Comprador2" , 0.2 ,"Veiculo Desejado2"));


		// dados Comprador 3 	
		dadosComprador.add(new Comprador("Nome Comprador3","Email Comprador3" ,
				00003,"Cpf3", "Endereco Comprador3" , 0.3,"Veiculo Desejado3"));

		// dados Comprador 4 	
		dadosComprador.add(new Comprador("Nome Comprador4","Email Comprador4" ,
				00004,"Cpf4", "Endereco Comprador4" , 0.4 ,"Veiculo Desejado4"));


		// dados Comprador 5
		dadosComprador.add(new Comprador("Nome Comprador5","Email Comprador5" ,
				00005,"Cpf5", "Endereco Comprador5" , 0.5 ,"Veiculo Desejado5"));

		//----------------------------------------------------------------------------------------------------------------		
		//dados Vendedor 1 
		dadosVendedor.add(new Vendedor("Nome Vendedor1","Email Vendedor1",
				00001 ,"Cpf1","Endereco1",01));


		//dados Vendedor 2 
		dadosVendedor.add(new Vendedor("Nome Vendedor2","Email Vendedor2",
				00002 ,"Cpf2","Endereco2",02));


		//dados Vendedor 3 
		dadosVendedor.add(new Vendedor("Nome Vendedor3","Email Vendedor3",
				00003 ,"Cpf3","Endereco3",03));


		//dados Vendedor 4 
		dadosVendedor.add(new Vendedor("Nome Vendedor4","Email Vendedor4",
				00004 ,"Cpf4","Endereco4",04));


		//dados Vendedor 5
		dadosVendedor.add(new Vendedor("Nome Vendedor5","Email Vendedor5",
				00005 ,"Cpf5","Endereco5",05));

		//----------------------------------------------------------------------------------------------------------------

		//dadosVeiculo1
		dadosVeiculo.add(new Veiculo("Veiculo1",0001 ,"Cor1", 1, 1, 1.0000, 
				"01 km","Categoria1", "Marca1"));

		//dadosVeiculo2
		dadosVeiculo.add(new Veiculo("Veiculo2",0002 ,"Cor2", 2, 2, 2.0000, 
				"02 km","Categoria2", "Marca2"));

		//dadosVeiculo3
		dadosVeiculo.add(new Veiculo("Veiculo3",0003 ,"Cor3", 3, 3, 3.0000, 
				"03 km","Categoria3", "Marca3"));

		//dadosVeiculo4
		dadosVeiculo.add(new Veiculo("Veiculo4",0004 ,"Cor4", 4, 4, 4.0000, 
				"04 km","Categoria4", "Marca4"));

		//dadosVeiculo5
		dadosVeiculo.add(new Veiculo("Veiculo5",0005 ,"Cor5", 5, 5, 5.0000, 
				"05 km","Categoria5", "Marca5"));

		//----------------------------------------------------------------------------------------------------

		//dados Venda 1 
		dadosVenda.add(new Venda("Vendedor1", "Veiculo1", 0.1, 
				"Local da Venda1"));

		//dados Venda 2
		dadosVenda.add(new Venda("Vendedor2", "Veiculo2", 0.2, 
				"Local da Venda2"));

		//dados Venda 3 
		dadosVenda.add(new Venda("Vendedor3", "Veiculo3", 0.3, 
				"Local da Venda3"));

		//dados Venda 4
		dadosVenda.add(new Venda("Vendedor4", "Veiculo4", 0.4, 
				"Local da Venda4"));

		//dados Venda 5
		dadosVenda.add(new Venda("Vendedor5", "Veiculo5", 0.5, 
				"Local da Venda5"));


		//-------------------------------------------------------------------------------------------------------
		//dados Concessionaria 1
		dadosConcessionaria.add(new Concessionaria("Nome Concessionaria1", 100, 01,
				"Endereço da Venda1"));


		//dados Concessionaria 2
		dadosConcessionaria.add(new Concessionaria("Nome Concessionaria2", 200, 12,
				"Endereço da Venda2"));

		//dados Concessionaria 3
		dadosConcessionaria.add(new Concessionaria("Nome Concessionaria3", 300, 13,
				"Endereço da Venda3"));


		//dados Concessionaria 4
		dadosConcessionaria.add(new Concessionaria("Nome Concessionaria4", 400, 14,
				"Endereço da Venda4"));

		//dados Concessionaria 5
		dadosConcessionaria.add(new Concessionaria("Nome Concessionaria5", 500, 15,
				"Endereço da Venda5"));

	}	

	//Getts e Setts
	public ArrayList<Comprador> getDadosComprador() {
		return dadosComprador;
	}
	public void setDadosComprador(ArrayList<Comprador> dadosComprador) {
		this.dadosComprador = dadosComprador;
	}
	public ArrayList<Vendedor> getDadosVendedor() {
		return dadosVendedor;
	}
	public void setDadosVendedor(ArrayList<Vendedor> dadosVendedor) {
		this.dadosVendedor = dadosVendedor;
	}
	public ArrayList<Veiculo> getDadosVeiculo() {
		return dadosVeiculo;
	}
	public void setDadosVeiculo(ArrayList<Veiculo> dadosVeiculo) {
		this.dadosVeiculo = dadosVeiculo;
	}
	public ArrayList<Venda> getDadosVenda() {
		return dadosVenda;
	}
	public void setDadosVenda(ArrayList<Venda> dadosVenda) {
		this.dadosVenda = dadosVenda;
	}
	public ArrayList<Concessionaria> getDadosConcessionaria() {
		return dadosConcessionaria;
	}
	public void setDadosConcessionaria(ArrayList<Concessionaria> dadosConcessionaria) {
		this.dadosConcessionaria = dadosConcessionaria;
	}

	public ArrayList<String> getDadosProntosLista() {
		return dadosProntosLista;
	}
	public void setDadosProntosLista(ArrayList<String> dadosProntosLista) {
		this.dadosProntosLista = dadosProntosLista;
	}




	public void cadastrarVeiculo(Veiculo v, int posicao, Dados d) {

		if(posicao == d.getDadosVeiculo().size()) {
			this.dadosVeiculo.add(v);

		}else {
			this.dadosVeiculo.set(posicao, v);
		}

	}

}


































