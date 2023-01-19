package Modelo;

import java.util.ArrayList;


public class Main {

	public static void main(String[]args) {

		// Vendedor
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
		lista.add(audix6);
		

		//Concessionaria
		Concessionaria orcaGama = new Concessionaria("Orca Gama", 200, 10, "Gama-DF");
		
		
		
		//Venda
		Venda x = new Venda("neymar", "audix6", 900.000, "orcaGama");

		
		orcaGama.buscarVeiculo(lista, audix6);
		
	
		
		/*
		System.out.print(neymar);
		System.out.print(renatoCariane);
		System.out.print(orcaGama);
		*/






  }
}