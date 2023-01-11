package Visualizacao;

import javax.swing.*;


public class TelaPrincipal {
	public 	static void main(String[]args) {

		//Tamanho da tela fixa  = 1920, 1080

		//Tela principal
		JFrame telaPrincipal = new JFrame("Home Page");
		telaPrincipal.setSize(1024, 600);
		telaPrincipal.setLocation(171, 83);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menu = new JMenuBar();
		telaPrincipal.setJMenuBar(menu);
		
		JMenu menuCompra = new JMenu("Comprar");
		JMenu menuVenda = new JMenu("Vender");
		
		menu.add(menuCompra);
		menu.add(menuVenda);
		
		JLabel label = new JLabel();
		label.setSize(300,300);
		
		telaPrincipal.setVisible(true);






	}

}
