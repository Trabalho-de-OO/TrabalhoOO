package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaDetalheVeiculo implements ActionListener {


	private JFrame janelaDetalhe;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JTextField entrada;
	private JTextField entrada2;
	private JTextField entrada3;
	private JTextField entrada4;
	private JTextField entrada5;
	private JTextField entrada6;
	private JTextField entrada7;
	private JTextField entrada8;
	private JTextField entrada9;
	private JLabel titulo;
	private JLabel titulo2;
	private JLabel titulo3;
	private JLabel titulo4;
	private JLabel titulo5;
	private JLabel titulo6;
	private JLabel titulo7;
	private JLabel titulo8;
	private JLabel titulo9;
	private JButton botaoSalvar;
	private JButton botaoExcluir;

	public TelaDetalheVeiculo() {
		
		//JFrame
				janelaDetalhe = new JFrame();
				janelaDetalhe.setBounds(573 ,159, 500 , 450);


				GridBagConstraints alinhamento = new GridBagConstraints();
				alinhamento.gridx = 0;
				alinhamento.gridy = 0;
				alinhamento.insets = new Insets(3,3,3,3);
				alinhamento.anchor = GridBagConstraints.FIRST_LINE_START;
				
				painelEsquerdo = new JPanel();
				painelEsquerdo.setBackground(Color.LIGHT_GRAY);
				painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

				painelCentral = new JPanel();
				painelCentral.setBounds(333 ,159, 500 , 450);	
				painelCentral.setLayout(new GridBagLayout());
				
				
				
				Dimension tamanhoEntrada = new Dimension(100,20);
				//Entradas
				entrada = new JTextField();
				entrada.setPreferredSize(tamanhoEntrada);
				entrada.setMaximumSize(tamanhoEntrada);
				entrada2 = new JTextField();
				entrada2.setPreferredSize(tamanhoEntrada);
				entrada2.setMaximumSize(tamanhoEntrada);
				entrada3 = new JTextField();
				entrada3.setPreferredSize(tamanhoEntrada);
				entrada3.setMaximumSize(tamanhoEntrada);
				entrada4 = new JTextField();
				entrada4.setPreferredSize(tamanhoEntrada);
				entrada4.setMaximumSize(tamanhoEntrada);
				entrada5 = new JTextField();
				entrada5.setPreferredSize(tamanhoEntrada);
				entrada5.setMaximumSize(tamanhoEntrada);
				entrada6 = new JTextField();
				entrada6.setPreferredSize(tamanhoEntrada);
				entrada6.setMaximumSize(tamanhoEntrada);
				entrada7 = new JTextField();
				entrada7.setPreferredSize(tamanhoEntrada);
				entrada7.setMaximumSize(tamanhoEntrada);
				entrada8 = new JTextField();
				entrada8.setPreferredSize(tamanhoEntrada);
				entrada8.setMaximumSize(tamanhoEntrada);
				entrada9 = new JTextField();
				entrada9.setPreferredSize(tamanhoEntrada);
				entrada9.setMaximumSize(tamanhoEntrada);


				//Titulo
				titulo =  new JLabel("Nome :");
				titulo2 = new JLabel("Ano :");
				titulo3 = new JLabel("Cor :");
				titulo4 = new JLabel("Final da Placa :");
				titulo5 = new JLabel("Numero de Portas :");
				titulo6 = new JLabel("Preco :");
				titulo7 = new JLabel("Quilometragem :");
				titulo8 = new JLabel("Categoria :");
				titulo9 = new JLabel("Marca :");

				Dimension tamanhoBotao = new Dimension(100,30);
				//Botoes
				botaoSalvar = new JButton("Salvar");
				botaoSalvar.setPreferredSize(tamanhoBotao);
				botaoSalvar.setMaximumSize(tamanhoBotao);
				botaoExcluir = new JButton("Excluir");
				botaoExcluir.setPreferredSize(tamanhoBotao);
				botaoExcluir.setMaximumSize(tamanhoBotao);
				
				alinhamento.gridx = 0;
				alinhamento.gridy = 0;
				painelCentral.add(titulo,alinhamento);
				alinhamento.gridx =1;
				alinhamento.gridy = 0;
				painelCentral.add(entrada,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 1;
				painelCentral.add(titulo2,alinhamento);
				alinhamento.gridx =1;
				alinhamento.gridy =1;
				painelCentral.add(entrada2,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 2;
				painelCentral.add(titulo3,alinhamento);
				alinhamento.gridx =1;
				alinhamento.gridy =2;
				painelCentral.add(entrada3,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 3;
				painelCentral.add(titulo4,alinhamento);
				alinhamento.gridx = 1;
				alinhamento.gridy = 3;
				painelCentral.add(entrada4,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 4;
				painelCentral.add(titulo5,alinhamento);
				alinhamento.gridx = 1;
				alinhamento.gridy = 4;
				painelCentral.add(entrada5,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 5;
				painelCentral.add(titulo6,alinhamento);
				alinhamento.gridx = 1;
				alinhamento.gridy = 5;
				painelCentral.add(entrada6,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 6;
				painelCentral.add(titulo7,alinhamento);
				alinhamento.gridx = 1;
				alinhamento.gridy = 6;
				painelCentral.add(entrada7,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 7;
				painelCentral.add(titulo8,alinhamento);		
				alinhamento.gridx = 1;
				alinhamento.gridy = 7;
				painelCentral.add(entrada8,alinhamento);
				alinhamento.gridx = 0;
				alinhamento.gridy = 8;
				painelCentral.add(titulo9,alinhamento);
				alinhamento.gridx = 1;
				alinhamento.gridy = 8;
				
				painelCentral.add(entrada9,alinhamento);
				
				painelEsquerdo.add(botaoSalvar);
				painelEsquerdo.add(Box.createVerticalStrut(5));
				painelEsquerdo.add(botaoExcluir);
				painelEsquerdo.add(Box.createVerticalStrut(5));
				
				janelaDetalhe.add(painelCentral);
				janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);
				
				janelaDetalhe.setVisible(true);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

