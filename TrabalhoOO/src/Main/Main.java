package Main;

import ClassesUml.Comprador;
import ClassesUml.Veiculo;
import ClassesUml.Venda;
import ClassesUml.Vendedor;

public class Main {

	public static void main(String[]args) {
		// Veiculo		
		Veiculo camaro = new Veiculo(2020 ,"Amarelo", 8, 4, 24.0000, "200 km","Sedan", "Chevrolet");
		System.out.println(camaro);
		//Vendedor
		Vendedor Neymar = new Vendedor("Neymar","Neymarzinn@gmail.com",556565,"013154486","Sao Paulo",5);
		System.out.println(Neymar);
		//Comprador
		Comprador RenatoCariane = new Comprador("RenatoCariane","Renatin@gmailcom",554544,"032565525","Sao Paulo", 900.000,"Audi x6");
		System.out.println(RenatoCariane);
		//Venda
		Venda x = new Venda(16656565,Neymar,camaro);
		System.out.println(x);
	}
}
	