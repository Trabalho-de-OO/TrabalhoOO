package Modelo;

import java.util.ArrayList;


public class Main {

	
		public static void main(String[] args) {
		

			/*dadosVeiculo[6].matches("\\d\\d\\d\\d\\d\\d\\d") && dadosVeiculo[7].matches("\\d\\d\\d\\d\\d\\d")){
		*/
			boolean ano = "9999".matches("\\d{4}");
			System.out.println(ano);
			
			boolean finalPlaca = "4".matches("\\d");
			System.out.println(finalPlaca);
			boolean numPortas = "3".matches("[2-4]");
			System.out.println(numPortas);
			
			boolean preco= "37000".matches("[1-9][0-9]{3,6}");
			System.out.println(preco);
			
			boolean quilometragem = "9999".matches("[0-9][0-9]{0,4}");
			System.out.println(quilometragem);
			
			boolean idVenda = "10230".matches("\\d{5}");
			System.out.println(idVenda);
			
			boolean precoVenda = "1000".matches("[1-9][0-9]{3,6}");
			System.out.print(precoVenda);
	}	
}	//	

/*		// Vendedor
		Vendedor neymar = new Vendedor("Neymar","Neymarzinn@gmail.com",556565,"013154486","Sao Paulo",5);

		// Comprador
		Comprador renatoCariane = new Comprador("RenatoCariane",
				"Renatin@gmailcom",554544,"032565525","Sao Paulo", 900.000,"Audi x6");


		// Veiculos		
		Veiculo audix6= new Veiculo("Audix6",2020 ,"Amarelo", 8, 4, 24.0000, 
				"200 km","Sedan", "Audi");
		
		
		Veiculo ferrari = new Veiculo("Ferrari",2020, "Branco", 0, 4, 21.000,
				"300km", "Esporte", "ferrari");


		//Lista de Veiculos
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
	
		lista.add(ferrari);
		
		

		

		//Concessionaria
		Concessionaria orcaGama = new Concessionaria("Orca Gama", 200, 10, "Gama-DF");
		
		
		orcaGama.buscarVeiculo(lista, audix6);
		
		
		//Venda
		Venda x = new Venda(0000,"neymar", "audix6", 900.000, "orcaGama");
	
		/*
		Dados dados1 = new Dados();
		dados1.dadosProntos(); 
		*/
		
		
		
	
		/*
		System.out.print(dados1);
		*/
		
		
		
	
		
		/*
		System.out.print(neymar);
		System.out.print(renatoCariane);
		System.out.print(orcaGama);
		






  }
}
*/

