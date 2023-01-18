package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<Comprador> comprador = new ArrayList<>();
		
		
		int i = 0;
		while(i<10) {
			
			Comprador comprador1 = new Comprador("Nome" + i
					, null, i, null, null, 0.0, null);
			comprador.add(comprador1);
			
			i++;
		}
		System.out.print(comprador.get(9));

	}
}