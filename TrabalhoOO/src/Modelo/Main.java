package Modelo;

import java.util.ArrayList;


public class Main {

	public static void main(String[]args) {
		
		// Veiculo		
		Veiculo audix6= new Veiculo("Audix6",2020 ,"Amarelo", 8, 4, 24.0000, 
				"200 km","Sedan", "Audi");
		Veiculo ferrari = new Veiculo("Ferrari",2020, "Branco", 0, 4, 21.000,
				"300km", "Esporte", "ferrari");
		
		
		ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();
		
		Concessionaria gamaorc = new Concessionaria("Orca Gama", 200, 10, "Gama-DF", listaVeiculo);
		gamaorc.adicionarVeiculo(audix6);
		gamaorc.adicionarVeiculo(ferrari);
		
		System.out.println(gamaorc);
		/*
		//Vendedor
		Vendedor neymar = new Vendedor("Neymar","Neymarzinn@gmail.com",556565,"013154486","Sao Paulo",5);
		System.out.println(neymar);
		//Comprador
		Comprador renatoCariane = new Comprador("RenatoCariane","Renatin@gmailcom",554544,"032565525","Sao Paulo", 900.000,"Audi x6");
		System.out.println(renatoCariane);
		//Concessionaria
		Concessionaria orcaGama = new Concessionaria("Orca Gama", 200, 10, "Gama-DF" , null);
		//Venda
		Venda x = new Venda(152020, neymar, audix6, 900.000, orcaGama);
		System.out.println(x);
	
		System.out.print(ferrari);
		*/
		
		
		
		
		
		
	}
}