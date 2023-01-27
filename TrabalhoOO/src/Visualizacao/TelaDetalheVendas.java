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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controle.ControleDados;

public class TelaDetalheVendas implements ActionListener{
	
	private JFrame janelaDetalhe;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JTextField entrada1;
	private JTextField entrada2;
	private JTextField entrada3;
	private JTextField entrada4;
	private JTextField entrada5;
	
	private JLabel titulo;
	private JLabel titulo2;
	private JLabel titulo3;
	private JLabel titulo4;
	private JLabel titulo5;
	
	private JButton botaoSalvar;
	private JButton botaoExcluirVendas;
	private String [] dadosVenda;
	private int posicao;
	private ControleDados dados = new ControleDados();
	public TelaDetalheVendas() {
		
		janelaDetalhe = new JFrame();
		janelaDetalhe.setBounds(573 ,159, 500 , 450);	


		GridBagConstraints alinhamento = new GridBagConstraints();
		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		alinhamento.insets = new Insets(10,10,10,10);
		alinhamento.anchor = GridBagConstraints.CENTER;
		
		painelEsquerdo = new JPanel();
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

		painelCentral = new JPanel();
		painelCentral.setBounds(333 ,159, 500 , 450);	
		painelCentral.setLayout(new GridBagLayout());
		
		
		
		Dimension tamanhoEntrada = new Dimension(100,20);
		//Entradas
		entrada1 = new JTextField();
		entrada1.setPreferredSize(tamanhoEntrada);
		entrada1.setMaximumSize(tamanhoEntrada);
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
		

		//Titulo
		titulo =  new JLabel("ID Venda");
		titulo2 = new JLabel("Vendedor");
		titulo3 = new JLabel("Veiculo");
		titulo4 = new JLabel("Preco da Venda");
		titulo5 = new JLabel("Local Venda");
		
		Dimension tamanhoBotao = new Dimension(100,30);
		//Botoes
		botaoSalvar = new JButton("Salvar");
		botaoSalvar.setPreferredSize(tamanhoBotao);
		botaoSalvar.setMaximumSize(tamanhoBotao);
		botaoExcluirVendas = new JButton("Excluir");
		botaoExcluirVendas.setPreferredSize(tamanhoBotao);
		botaoExcluirVendas.setMaximumSize(tamanhoBotao);
		
		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		painelCentral.add(titulo,alinhamento);
		alinhamento.gridx =1;
		alinhamento.gridy = 0;
		painelCentral.add(entrada1,alinhamento);
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
		
		botaoSalvar.addActionListener(this);
		painelEsquerdo.add(botaoSalvar);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		painelEsquerdo.add(botaoExcluirVendas);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		
		janelaDetalhe.add(painelCentral);
		janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);
		
		janelaDetalhe.setVisible(true);
		
		
		
	}
	public void sucessoCadastro(){

		JOptionPane.showMessageDialog(null, "Dados Cadastrados com Sucesso", null,
				JOptionPane.INFORMATION_MESSAGE);
		janelaDetalhe.dispose();
	}

	public void erroCadastro() {
		JOptionPane.showMessageDialog(null, "Erro ao Cadastrar", null,
				JOptionPane.ERROR_MESSAGE);



	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		Object src = e.getSource();
		if(src == botaoSalvar) {

			try {

				boolean resultado;

				dadosVenda= new String[6];
				dadosVenda[0] = Integer.toString(posicao);
				dadosVenda[1] = entrada1.getText(); 
				dadosVenda[2] = entrada2.getText();
				dadosVenda[3] = entrada3.getText();
				dadosVenda[4] = entrada4.getText();
				dadosVenda[5] = entrada5.getText();
				resultado = dados.cadastrarVenda(dadosVenda);
				if(resultado == true) {
					sucessoCadastro();
				}else {
					erroCadastro();
				}

			}catch(Exception exe) {

			}

		}*/
	}
	


}
