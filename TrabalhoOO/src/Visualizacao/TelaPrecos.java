package Visualizacao;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaPrecos implements ActionListener {
	private JFrame telaPrecos;
	private JComboBox<String> listaPrecos;
	private JLabel titulo2 ; 
	private JButton botaoBuscar2;


	public TelaPrecos (){
		telaPrecos = new JFrame();
		telaPrecos.setBounds(483 ,159, 500 , 450);
		telaPrecos.setLayout(new GridBagLayout());
		telaPrecos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		GridBagConstraints centralizador2 = new GridBagConstraints();
		centralizador2.gridx = 0;
		centralizador2.gridy = 0;
		centralizador2.insets = new Insets(10,10,10,10);
		centralizador2.anchor = GridBagConstraints.CENTER;
		
		Dimension tamanhoBotao2 = new Dimension(150,30);
		
		listaPrecos = new JComboBox<>();
		listaPrecos.setPreferredSize(tamanhoBotao2);
		listaPrecos.setMaximumSize(tamanhoBotao2);
		listaPrecos.setMinimumSize(tamanhoBotao2);
		//Adição de item ao Combox
		listaPrecos.addItem("3.000,00 - 10.000,00");
		listaPrecos.addItem("10.000,00 - 50.000,00");
		
		
		titulo2 = new JLabel("Buscar por Preco");
		titulo2.setPreferredSize(tamanhoBotao2);
		titulo2.setMaximumSize(tamanhoBotao2);
		titulo2.setMinimumSize(tamanhoBotao2);
		
		botaoBuscar2= new JButton("Buscar");
		botaoBuscar2.setPreferredSize(tamanhoBotao2);
		botaoBuscar2.setMaximumSize(tamanhoBotao2);
		botaoBuscar2.setMinimumSize(tamanhoBotao2);
		
		centralizador2.gridy = 0;
		telaPrecos.add(titulo2,centralizador2);
		centralizador2.gridy = 1;
		telaPrecos.add(listaPrecos,centralizador2);
		centralizador2.gridy = 2;
		telaPrecos.add(botaoBuscar2, centralizador2);
			
		telaPrecos.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TelaPrecos telaPrecos = new TelaPrecos();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
 }


}
