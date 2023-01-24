package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Controle.ControleDados;
import Controle.ControleVeiculo;
import Controle.ControleVendas;

public class TelaCadastros implements ActionListener, ListSelectionListener{

	private JFrame tela ;
	private JPanel painelEsquerdo,painelCentral;
	private JButton botaoCadastrarVeiculos,botaoAtualizarVeiculos,
	botaoBuscarMarcas, botaoBuscarPrecos, botaoCadastrarVendas,botaoAtualizarVendas;
	private JComboBox<String> listaPrecos;
	private JTextField entradaMarcas;
	private JLabel tituloMarcas,tituloPrecos, tituloCadastro;
	private JList<String> listasVeiculos, listasVendas;

	private static ControleDados controleDados = new ControleDados();


	public void mostrarTela(ControleDados dados, int op) {
		controleDados = dados;

		switch(op) {

		case 1:


			//JFrame
			tela = new JFrame();
			painelEsquerdo = new JPanel();
			painelCentral = new JPanel();
			botaoCadastrarVeiculos = new JButton("Cadastrar");
			botaoAtualizarVeiculos = new JButton("Atualizar");
			tituloMarcas = new JLabel("Buscar por Marcas");
			entradaMarcas = new JTextField();
			botaoBuscarMarcas = new JButton("Buscar");
			tituloCadastro = new JLabel("Alguns Veiculos Cadastrados");
			listasVeiculos = new JList<String>(new ControleVeiculo(controleDados).getListaVeiculosProntos());
			
			
			tela.setBounds(483 ,159, 500 , 450);	
			tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

			
			
		
			botaoAtualizarVeiculos.addActionListener(this);
			
		
			
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());

			Dimension tamanhoBotoes = new Dimension(100,30);
			Dimension tamanhoEntrada = new Dimension(200,30);
			GridBagConstraints alinhadorPainelCentral = new GridBagConstraints();
			alinhadorPainelCentral.gridx = 0;
			alinhadorPainelCentral.gridy = 0;
			alinhadorPainelCentral.insets = new Insets(10,10,10,10);
			alinhadorPainelCentral.anchor = GridBagConstraints.FIRST_LINE_START;
		
			entradaMarcas.setPreferredSize(tamanhoEntrada);
			entradaMarcas.setMaximumSize(tamanhoEntrada);
			botaoBuscarMarcas.setPreferredSize(tamanhoBotoes);
			botaoBuscarMarcas.setMaximumSize(tamanhoBotoes);
			botaoCadastrarVeiculos.setSize(tamanhoBotoes);
			botaoCadastrarVeiculos.setMaximumSize(tamanhoBotoes);
			botaoAtualizarVeiculos.setSize(tamanhoBotoes);
			botaoAtualizarVeiculos.setMaximumSize(tamanhoBotoes);
			
			tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));
			listasVeiculos.setPreferredSize(new Dimension(270,100));
			listasVeiculos.setBounds(20, 50, 350, 120);
			listasVeiculos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			

			painelEsquerdo.add(botaoCadastrarVeiculos);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoAtualizarVeiculos);
			painelEsquerdo.add(Box.createVerticalStrut(5));

			alinhadorPainelCentral.gridy = 0;
			painelCentral.add(tituloCadastro, alinhadorPainelCentral);
			alinhadorPainelCentral.gridy = 1;
			painelCentral.add(listasVeiculos, alinhadorPainelCentral);
			alinhadorPainelCentral.gridy = 3;
			painelCentral.add(tituloMarcas,alinhadorPainelCentral);
			alinhadorPainelCentral.gridy = 4;
			painelCentral.add(entradaMarcas,alinhadorPainelCentral);
			alinhadorPainelCentral.gridy = 5;
			painelCentral.add(botaoBuscarMarcas,alinhadorPainelCentral);


			botaoCadastrarVeiculos.addActionListener(this);
			listasVeiculos.addListSelectionListener(this);
			tela.add(painelEsquerdo, BorderLayout.WEST);
			tela.add(painelCentral);
			tela.setVisible(true);

			break;


		case 2:
			//JFrame
			tela = new JFrame();
			tela.setBounds(483 ,159, 500 , 450);	
			tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			//Painel de Opcoes e seus componentes 
			painelEsquerdo = new JPanel();
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

			// Dimension para setar o tamanho dos botoes
			Dimension tamanhoBotoes2 = new Dimension(100,30);
			botaoCadastrarVendas = new JButton("Cadastrar");
			botaoCadastrarVendas.setSize(tamanhoBotoes2);
			botaoCadastrarVendas.setMaximumSize(tamanhoBotoes2);
			botaoCadastrarVendas.addActionListener(this);

			botaoAtualizarVendas = new JButton("Atualizar");
			botaoAtualizarVendas.setSize(tamanhoBotoes2);
			botaoAtualizarVendas.setMaximumSize(tamanhoBotoes2);
			botaoAtualizarVendas.addActionListener(this);


			//Componentes do painel central
			painelCentral = new JPanel();
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());

			// alinhador do Painel
			GridBagConstraints alinhadorPainelCentral2 = new GridBagConstraints();
			alinhadorPainelCentral2.gridx = 0;
			alinhadorPainelCentral2.gridy = 0;
			alinhadorPainelCentral2.insets = new Insets(5, 5, 5, 5);
			alinhadorPainelCentral2.anchor = GridBagConstraints.FIRST_LINE_START;

			tituloCadastro = new JLabel("Algumas Vendas Cadastradas");
			tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));

			//JList
			listasVendas = new JList<String>(new ControleVendas(controleDados).getListaVenda());
			listasVendas.setBounds(20, 50, 350, 120);
			listasVendas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listasVendas.setVisibleRowCount(10);

			//adicao do painel de opcoes
			painelEsquerdo.add(botaoCadastrarVendas);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoAtualizarVendas);
			painelEsquerdo.add(Box.createVerticalStrut(5));

			Dimension tamanhoComboBox = new Dimension(200,30);
			//Listagem de Marcas
			tituloPrecos = new JLabel("Precos");
			tituloPrecos.setFont(new Font("Arial", Font.BOLD,14));
			listaPrecos = new JComboBox<String>();
			listaPrecos.setPreferredSize(tamanhoComboBox);
			listaPrecos.setMaximumSize(tamanhoComboBox);
			listaPrecos.addItem("3.000,00 - 10.000,00");
			listaPrecos.addItem("10.000,00 - 50.000,00");

			botaoBuscarPrecos = new JButton("Buscar");
			botaoBuscarPrecos.setPreferredSize(tamanhoBotoes2);
			botaoBuscarPrecos.setMaximumSize(tamanhoBotoes2);



			//adicao do painel Central
			alinhadorPainelCentral2.gridy = 0;
			painelCentral.add(tituloCadastro, alinhadorPainelCentral2);
			alinhadorPainelCentral2.gridy = 1;
			painelCentral.add(listasVendas, alinhadorPainelCentral2);

			alinhadorPainelCentral2.gridy = 3;
			painelCentral.add(tituloPrecos,alinhadorPainelCentral2);
			alinhadorPainelCentral2.gridy = 4;
			painelCentral.add(listaPrecos,alinhadorPainelCentral2);

			alinhadorPainelCentral2.gridy = 5;
			painelCentral.add(botaoBuscarPrecos,alinhadorPainelCentral2);
			
			
			listasVendas.addListSelectionListener(this);
			tela.add(painelEsquerdo, BorderLayout.WEST);
			tela.add(painelCentral);


			tela.setVisible(true);

			break;

		default :
			JOptionPane.showMessageDialog(null,"Error", null, 
					JOptionPane.ERROR_MESSAGE);

		}

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if(src == botaoCadastrarVeiculos)
			new TelaDetalheVeiculo();

		if(src == botaoCadastrarVendas)
			new TelaDetalheVendas();



	}



	@Override
	public void valueChanged(ListSelectionEvent e) {

		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listasVeiculos) {
			new TelaDetalhes().mostrarTelaDetalhes(1,controleDados, this, listasVeiculos.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listasVendas) {
			new TelaDetalhes().mostrarTelaDetalhes(2, controleDados, this, listasVendas.getSelectedIndex());
		}
		
		
		
	}
}
