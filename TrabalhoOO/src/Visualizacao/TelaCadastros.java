package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import Controle.ControleDados;
import Controle.ControleVeiculo;
import Controle.ControleVendas;

public class TelaCadastros {
	
	private JFrame tela ;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JButton botaoCadastrar;
	private JButton botaoAtualizar;
	private JLabel tituloCadastro ;
	private JList<String> listaVendas;
	private JList<String> listaVeiculos;
	private static ControleDados dados = new ControleDados();

	
	public void mostrarTela(ControleDados d, int op) {
		dados = d;
		
		switch(op) {
		
		case 1:


			//JFrame
			//Componentes do painel de opcoes
			tela = new JFrame();
			tela.setBounds(483 ,159, 500 , 450);	
			tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


			painelEsquerdo = new JPanel();
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

			Dimension tamanhoBotoes = new Dimension(150,40);
			botaoCadastrar = new JButton("Cadastrar");
			botaoCadastrar.setSize(tamanhoBotoes);
			botaoCadastrar.setMaximumSize(tamanhoBotoes);

			botaoAtualizar = new JButton("Atualizar");
			botaoAtualizar.setSize(tamanhoBotoes);
			botaoAtualizar.setMaximumSize(tamanhoBotoes);



			//Componentes do painel central
			painelCentral = new JPanel();
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());

			// alinhador do Painel
			GridBagConstraints alinhadorPainelCentral = new GridBagConstraints();
			alinhadorPainelCentral.gridx = 0;
			alinhadorPainelCentral.gridy = 0;
			alinhadorPainelCentral.insets = new Insets(10,10,10,10);
			alinhadorPainelCentral.anchor = GridBagConstraints.CENTER;

			tituloCadastro = new JLabel("Alguns Veiculos Cadastrados");
			tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		
			//JList
			listaVeiculos = new JList<String>(new ControleVeiculo(dados).getListaVeiculo());
			
			
			
			
			listaVeiculos.setBounds(20, 50, 350, 120);
			listaVeiculos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaVeiculos.setVisibleRowCount(10);
			
			//adicao do painel de opcoes
			painelEsquerdo.add(botaoCadastrar);
			painelEsquerdo.add(Box.createVerticalStrut(10));
			painelEsquerdo.add(botaoAtualizar);
			painelEsquerdo.add(Box.createVerticalStrut(10));

			//adicao do painel Central
			alinhadorPainelCentral.gridy = 0;
			painelCentral.add(tituloCadastro, alinhadorPainelCentral);
			alinhadorPainelCentral.gridy = 1;
			painelCentral.add(listaVeiculos, alinhadorPainelCentral);


			tela.add(painelEsquerdo, BorderLayout.WEST);
			tela.add(painelCentral);


			tela.setVisible(true);
			break;
			
			
		case 2:
			

			//JFrame
			//Componentes do painel de opcoes
			tela = new JFrame();
			tela.setBounds(483 ,159, 500 , 450);	
			tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


			painelEsquerdo = new JPanel();
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

			Dimension tamanhoBotoes2 = new Dimension(150,40);
			botaoCadastrar = new JButton("Cadastrar");
			botaoCadastrar.setSize(tamanhoBotoes2);
			botaoCadastrar.setMaximumSize(tamanhoBotoes2);

			botaoAtualizar = new JButton("Atualizar");
			botaoAtualizar.setSize(tamanhoBotoes2);
			botaoAtualizar.setMaximumSize(tamanhoBotoes2);



			//Componentes do painel central
			painelCentral = new JPanel();
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());

			// alinhador do Painel
			GridBagConstraints alinhadorPainelCentral2 = new GridBagConstraints();
			alinhadorPainelCentral2.gridx = 0;
			alinhadorPainelCentral2.gridy = 0;
			alinhadorPainelCentral2.insets = new Insets(10,10,10,10);
			alinhadorPainelCentral2.anchor = GridBagConstraints.CENTER;

			tituloCadastro = new JLabel("Algumas Vendas");
			tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		
			//JList
			listaVendas = new JList<String>((new ControleVendas(dados).getListaVenda()));
			
			
			
			
			listaVendas.setBounds(20, 50, 350, 120);
			listaVendas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaVendas.setVisibleRowCount(10);
			
			//adicao do painel de opcoes
			painelEsquerdo.add(botaoCadastrar);
			painelEsquerdo.add(Box.createVerticalStrut(10));
			painelEsquerdo.add(botaoAtualizar);
			painelEsquerdo.add(Box.createVerticalStrut(10));

			//adicao do painel Central
			alinhadorPainelCentral2.gridy = 0;
			painelCentral.add(tituloCadastro, alinhadorPainelCentral2);
			alinhadorPainelCentral2.gridy = 1;
			painelCentral.add(listaVendas, alinhadorPainelCentral2);


			tela.add(painelEsquerdo, BorderLayout.WEST);
			tela.add(painelCentral);


			tela.setVisible(true);
			
			break;
			
			default :
				JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
			
		}
			
	}
	
}
