package Visualizacao;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaVeiculos implements ActionListener {
	private JFrame telaVeiculos;
	private JLabel nomeVeiculo ;
	private JLabel anoVeiculo;
	private JLabel numeroFinalPlaca;
	private JLabel numeroPortasVeiculo;
	private JLabel valorVeiculo;
	private JLabel quilometragemVeiculo;
	private JLabel marcaVeiculo;
	private JLabel categoriaVeiculo;
	private JTextField entrada1;
	private JTextField entrada2;
	private JTextField entrada3;
	private JTextField entrada4;
	private JTextField entrada5;
	private JTextField entrada6;
	private JTextField entrada7;
	private JTextField entrada8;
	private JButton botaoCadastrar;
	public TelaVeiculos() {
		//
		telaVeiculos = new JFrame();
		telaVeiculos.setBounds(483 ,159, 500 , 550);
		telaVeiculos.setLayout(new GridBagLayout());
		telaVeiculos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagConstraints centralizador2 = new GridBagConstraints();
		centralizador2.gridx = 0;
		centralizador2.gridy = 0;
		centralizador2.insets = new Insets(5,5,5,5);
		centralizador2.anchor = GridBagConstraints.CENTER;
		
		//JLabels
		
		nomeVeiculo =  new JLabel("Nome do Veiculo");
		anoVeiculo =  new JLabel("Ano");
		numeroFinalPlaca = new JLabel("Placa-NumeroFinal");
		numeroPortasVeiculo = new JLabel("Numero de Portas");
		valorVeiculo = new JLabel("Valor");
		quilometragemVeiculo = new JLabel("Quilometragem");
		marcaVeiculo = new JLabel("Marca");
		categoriaVeiculo = new JLabel("Categoria");

		//JTextField
		Dimension tamanhoEntradas = new Dimension(200, 20);
		entrada1 = new JTextField();
		entrada1.setPreferredSize(tamanhoEntradas);
		entrada1.setMaximumSize(tamanhoEntradas);
		entrada1.setMinimumSize(tamanhoEntradas);
		
		entrada2 = new JTextField();
		entrada2.setPreferredSize(tamanhoEntradas);
		entrada2.setMaximumSize(tamanhoEntradas);
		entrada2.setMinimumSize(tamanhoEntradas);
		
		entrada3 = new JTextField();
		entrada3.setPreferredSize(tamanhoEntradas);
		entrada3.setMaximumSize(tamanhoEntradas);
		entrada3.setMinimumSize(tamanhoEntradas);
		
		entrada4 = new JTextField();
		entrada4.setPreferredSize(tamanhoEntradas);
		entrada4.setMaximumSize(tamanhoEntradas);
		entrada4.setMinimumSize(tamanhoEntradas);
		
		entrada5 = new JTextField();
		entrada5.setPreferredSize(tamanhoEntradas);
		entrada5.setMaximumSize(tamanhoEntradas);
		entrada5.setMinimumSize(tamanhoEntradas);
		
		entrada6 = new JTextField();
		entrada6.setPreferredSize(tamanhoEntradas);
		entrada6.setMaximumSize(tamanhoEntradas);
		entrada6.setMinimumSize(tamanhoEntradas);
		
		entrada7 = new JTextField();
		entrada7.setPreferredSize(tamanhoEntradas);
		entrada7.setMaximumSize(tamanhoEntradas);
		entrada7.setMinimumSize(tamanhoEntradas);
		
		entrada8 = new JTextField();
		entrada8.setPreferredSize(tamanhoEntradas);
		entrada8.setMaximumSize(tamanhoEntradas);
		entrada8.setMinimumSize(tamanhoEntradas);
		
		botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setPreferredSize(tamanhoEntradas);
		botaoCadastrar.setMaximumSize(tamanhoEntradas);
		botaoCadastrar.setMinimumSize(tamanhoEntradas);
		
		//Centralizando os titulos e as entradas 
		centralizador2.gridy = 0;
		telaVeiculos.add(nomeVeiculo,centralizador2);
		centralizador2.gridy = 1;
		telaVeiculos.add(entrada1,centralizador2);
		
		centralizador2.gridy = 3;
		telaVeiculos.add(anoVeiculo,centralizador2);
		centralizador2.gridy = 4;
		telaVeiculos.add(entrada2,centralizador2);
		
		centralizador2.gridy = 5;
		telaVeiculos.add(numeroFinalPlaca,centralizador2);
		centralizador2.gridy = 6;
		telaVeiculos.add(entrada3,centralizador2);
		
		centralizador2.gridy = 7;
		telaVeiculos.add(numeroPortasVeiculo,centralizador2);
		centralizador2.gridy = 8;
		telaVeiculos.add(entrada4,centralizador2);
		
		centralizador2.gridy = 9;
		telaVeiculos.add(valorVeiculo,centralizador2);
		centralizador2.gridy = 10;
		telaVeiculos.add(entrada5,centralizador2);
		
		centralizador2.gridy = 11;
		telaVeiculos.add(quilometragemVeiculo,centralizador2);
		centralizador2.gridy = 12;
		telaVeiculos.add(entrada6,centralizador2);
		
		centralizador2.gridy = 13;
		telaVeiculos.add(marcaVeiculo,centralizador2);
		centralizador2.gridy = 14;
		telaVeiculos.add(entrada7,centralizador2);
		
		
		centralizador2.gridy = 15;
		telaVeiculos.add(categoriaVeiculo,centralizador2);
		centralizador2.gridy = 16;
		telaVeiculos.add(entrada8,centralizador2);
		

		centralizador2.gridy = 17;
		telaVeiculos.add(botaoCadastrar,centralizador2);
		
		telaVeiculos.setVisible(true);
	} 

	
	public static void main(String[] args) {
		TelaVeiculos telaVeiculos = new TelaVeiculos();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
