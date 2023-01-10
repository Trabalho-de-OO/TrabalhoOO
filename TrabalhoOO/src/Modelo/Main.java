package Modelo;

public class Main {
	public static void main(String[]args) {
		// Veiculo		
		Veiculo audix6= new Veiculo(2020 ,"Amarelo", 8, 4, 24.0000, "200 km","Sedan", "Audi");
		System.out.println(audix6);
		//Vendedor
		Vendedor neymar = new Vendedor("Neymar","Neymarzinn@gmail.com",556565,"013154486","Sao Paulo",5);
		System.out.println(neymar);
		//Comprador
		Comprador renatoCariane = new Comprador("RenatoCariane","Renatin@gmailcom",554544,"032565525","Sao Paulo", 900.000,"Audi x6");
		System.out.println(renatoCariane);
		//Concessionaria
		Concessionaria orcaGama = new Concessionaria("Orca Gama", 200, 10, "Gama-DF" );
		//Venda
		Venda x = new Venda(152020, neymar, audix6, 900.000, orcaGama);
		System.out.println(x);
	}
}