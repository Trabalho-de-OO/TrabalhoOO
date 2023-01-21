
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
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import Controle.*;


public class TelaVeiculos implements ActionListener {
	private JFrame telaVeiculo ;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JButton botaoCadastrar;
	private JButton botaoAtualizar;
	private JLabel tituloCadastro ;
	private JList<String> listaVeiculos;
	private ControleDados dados = new ControleDados();



	public TelaVeiculos() {
		

		//JFrame
		//Componentes do painel de opcoes
		telaVeiculo = new JFrame();
		telaVeiculo.setBounds(483 ,159, 500 , 450);	
		telaVeiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


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


		telaVeiculo.add(painelEsquerdo, BorderLayout.WEST);
		telaVeiculo.add(painelCentral);


		telaVeiculo.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		TelaVeiculos tela = new TelaVeiculos();
	}

	@Override
	public void actionPerformed(ActionEvent a) {

	}
}	
