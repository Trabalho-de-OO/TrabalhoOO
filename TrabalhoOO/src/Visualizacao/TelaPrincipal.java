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
		
		//Tela de Menu 
		JMenuBar menu = new JMenuBar();
		telaPrincipal.setJMenuBar(menu);
		
		//Itens da Tela de Menu 
		JMenu menuCompra = new JMenu("Comprar");
		JMenu menuVenda = new JMenu("Vender");
		menu.add(menuCompra);
		menu.add(menuVenda);
		
		
		telaPrincipal.setVisible(true);






	}

}
