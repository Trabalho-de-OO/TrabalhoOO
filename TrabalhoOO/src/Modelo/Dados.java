package Modelo;



public class Dados {
	private  Comprador[] dadosComprador = new Comprador[100];
	private int quantComprador = 0;
	private Vendedor[] dadosVendedor = new Vendedor[100];
	private int quantVendedor = 0;
	private Venda[] dadosVenda = new Venda[100];
	private int quantVenda = 0;
	private Concessionaria[] dadosConcessionaria = new Concessionaria[100];
	private int quantConcessionaria = 0;


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

	
	public void armazenarDados() {
		
		for( int i = 0; i < 2; i++) {


			dadosComprador[i] = new Comprador("Nome Comprador" +i,
			"Email Comprador" + i,00000 +i,"Cpf"+i , "Endereco Comprador" + i, 0.0 +i,"Veiculo Desejado"+i);
			
			dadosVendedor[i] = new Vendedor("Nome Vendedor","Email Vendedor",
					00000 ,"Cpf","Endereco ",0);
			
			dadosVenda[i] = new Venda("Vendedor", "Veiculo", 0.0, "Local da Venda");
			
			dadosConcessionaria[i] = new Concessionaria("Nome Concessionaria", 200, 10, "Endereço da Venda");
			

		}
		quantComprador = 2;
		quantVendedor = 2;
		quantVenda = 2;
		quantConcessionaria = 2;
	
	}

	
	//Inserir dados 
	
	public void colocarDadosComprador(Comprador c, int pos) {
		this.dadosComprador[pos] = c;
		if(pos == quantComprador) quantComprador++;
	}
		public void colocarDadosVendedor(Vendedor v, int pos) {
			this.dadosVendedor[pos] = v;
			if(pos == quantVendedor) quantVendedor++;
		
		
		}
			public void colocarDadosVenda(Venda vd, int pos) {
				this.dadosVenda[pos] = vd;
				if(pos == quantVenda) quantVenda++;
			}
			
			public void colocarDadosConcessionaria(Concessionaria cr, int pos) {
					this.dadosConcessionaria[pos] = cr;
					if(pos ==  quantConcessionaria) quantConcessionaria++;
			}
		
	

	public String toString() {
		return "Dados : \n " 
	+ "Comprador : " + dadosComprador 
	+ "Vendedor : " + dadosVendedor
	+ "Venda : " + dadosVenda 
	+ "Concessionaria : " + dadosConcessionaria + "\n" + "\n";
		
	}
		
		          
			
}


	
	
	
