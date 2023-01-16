package Visualizacao;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaMarcas implements ActionListener {
	private JFrame telaMarcas;
	private JComboBox<String> listaCarros;
	private JLabel titulo ; 
	private JButton botaoBuscar;
	

	public TelaMarcas (){
		telaMarcas = new JFrame();
		telaMarcas.setBounds(483 ,159, 500 , 450);
		telaMarcas.setLayout(new GridBagLayout());
		telaMarcas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		
	
		GridBagConstraints centralizador = new GridBagConstraints();
		centralizador.gridx = 0;
		centralizador.gridy = 0;
		centralizador.insets = new Insets(10,10,10,10);
		centralizador.anchor = GridBagConstraints.CENTER;
		
		Dimension tamanhoBotao2 = new Dimension(150,30);
		listaCarros = new JComboBox<>();
		listaCarros.setPreferredSize(tamanhoBotao2);
		listaCarros.setMaximumSize(tamanhoBotao2);
		listaCarros.setMinimumSize(tamanhoBotao2);
		//Adição de item ao Combox
		listaCarros.addItem("Fiat");
		listaCarros.addItem("Ford");
		
		
		titulo = new JLabel("Buscar por Marcas");
		titulo.setPreferredSize(tamanhoBotao2);
		titulo.setMaximumSize(tamanhoBotao2);
		titulo.setMinimumSize(tamanhoBotao2);
		
		botaoBuscar	= new JButton("Buscar");
		botaoBuscar.setPreferredSize(tamanhoBotao2);
		botaoBuscar.setMaximumSize(tamanhoBotao2);
		botaoBuscar.setMinimumSize(tamanhoBotao2);
		
		centralizador.gridy = 0;
		telaMarcas.add(titulo,centralizador);
		centralizador.gridy = 1;
		telaMarcas.add(listaCarros,centralizador);
		centralizador.gridy = 2;
		telaMarcas.add(botaoBuscar, centralizador);
			
		telaMarcas.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TelaMarcas telaMarcas = new TelaMarcas();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	



}
