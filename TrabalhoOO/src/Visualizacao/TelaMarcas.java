package Visualizacao;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaMarcas implements ActionListener {
	private JFrame telaMarcas;
	private JTextField buscarMarcas;
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
		centralizador.insets = new Insets(5,5,5,5);
		centralizador.anchor = GridBagConstraints.CENTER;
		
		Dimension tamanhoBotao2 = new Dimension(150,30);
		buscarMarcas= new JTextField();
		buscarMarcas.setPreferredSize(tamanhoBotao2);
		buscarMarcas.setMaximumSize(tamanhoBotao2);
		buscarMarcas.setMinimumSize(tamanhoBotao2);
		
		
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
		telaMarcas.add(buscarMarcas,centralizador);
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
