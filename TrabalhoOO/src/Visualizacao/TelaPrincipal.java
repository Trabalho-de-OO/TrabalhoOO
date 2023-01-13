package Visualizacao;
//imports

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TelaPrincipal implements ActionListener{
	private JFrame telaPrincipal;
	private JPanel painel;
	private JButton botaoPrecos;
	private JButton botaoMarcas;
	private JButton botaoVeiculos;
	private JButton botaoVendas;
	//Criando o corpo da Tela
	public TelaPrincipal() {
		telaPrincipal = new JFrame("TelaPrincipal");
		telaPrincipal.setBounds(383, 159, 600, 450);
		
		painel = new JPanel();
		painel.setBounds(0, 0, 300, 225);
		painel.setBackground(Color.LIGHT_GRAY);
		painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
		
		Dimension tamanhoBotao = new Dimension(100,30);
		botaoPrecos= new JButton("Preços");
		botaoPrecos.setPreferredSize(tamanhoBotao);
		botaoPrecos.setMaximumSize(tamanhoBotao);
		botaoPrecos.setMaximumSize(tamanhoBotao);
		botaoMarcas = new JButton("Marcas");
		botaoMarcas.setPreferredSize(tamanhoBotao);
		botaoMarcas.setMaximumSize(tamanhoBotao);
		botaoMarcas.setMaximumSize(tamanhoBotao);
		
		botaoVeiculos= new JButton("Veiculos");
		botaoVeiculos.setPreferredSize(tamanhoBotao);
		botaoVeiculos.setMaximumSize(tamanhoBotao);
		botaoVeiculos.setMaximumSize(tamanhoBotao);
		botaoVendas = new JButton("Marcas");
		botaoVendas.setPreferredSize(tamanhoBotao);
		botaoVendas.setMaximumSize(tamanhoBotao);
		botaoVendas.setMaximumSize(tamanhoBotao);
		
		//Fazendo as devidas adicioes 
		
		painel.add(botaoMarcas);
		painel.add(Box.createVerticalStrut(5));
		painel.add(botaoPrecos);
		painel.add(Box.createVerticalStrut(5));
		painel.add(botaoVeiculos);
		painel.add(Box.createVerticalStrut(5));
		painel.add(botaoVendas);
		
		telaPrincipal.add(painel,BorderLayout.WEST);
		telaPrincipal.setVisible(true);

	}

//metodo main
	public 	static void main(String[]args) {
		TelaPrincipal tela = new TelaPrincipal();
		
		
}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}