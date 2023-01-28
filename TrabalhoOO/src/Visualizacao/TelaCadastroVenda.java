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
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Controle.ControleDados;
import Controle.ControleVendas;

public class TelaCadastroVenda  implements ActionListener{

	private JFrame tela ;
	private JPanel painelEsquerdo,painelCentral;
	private JButton botaoCadastrarVeiculos,botaoAtualizarVeiculos,
	botaoBuscarMarcas, botaoBuscarPrecos, botaoCadastrarVendas,botaoAtualizarVendas;
	private JComboBox<String> listaPrecos;
	private JTextField entradaMarcas;
	private JLabel tituloMarcas,tituloPrecos, tituloCadastro;
	private JList<String> listasVeiculos, listasVendas;
	private  DefaultListModel<String> listModel;
	private static ControleDados controleDados = new ControleDados();
	//private ControleVeiculo controleVeiculo = new ControleVeiculo();
	private ControleVendas controleVenda = new ControleVendas();
	//private String[] dadosVeiculo;
	//private String [] dadosProntos; 
	private JTable veiculosTable;
	private Font padraoFonte = new Font("Bodoni MT Condensed", Font.PLAIN, 12);
	private JPanel painelTable;
	//private TelaDetalheVeiculo telaDetalheVeiculo = new TelaDetalheVeiculo()
	private JTable vendaTable;
	
	public TelaCadastroVenda() {
		tela = new JFrame();
		botaoCadastrarVendas = new JButton("Cadastrar");
		botaoAtualizarVendas = new JButton("Atualizar");
		painelEsquerdo = new JPanel();
		painelCentral = new JPanel();
		tituloPrecos = new JLabel("Precos");
		botaoBuscarPrecos = new JButton("Buscar");
		
		tela.setBounds(483 ,159, 500 , 450);	
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
		painelCentral.setBounds(333 ,159, 500 , 450);	
		painelCentral.setLayout(new GridBagLayout());
		
		Dimension tamanhoBotoes2 = new Dimension(100,30);
		botaoCadastrarVendas.setSize(tamanhoBotoes2);
		botaoCadastrarVendas.setMaximumSize(tamanhoBotoes2);
		botaoCadastrarVendas.addActionListener(this);

		

	

		// alinhador do Painel
		GridBagConstraints alinhadorPainelCentral2 = new GridBagConstraints();
		alinhadorPainelCentral2.gridx = 0;
		alinhadorPainelCentral2.gridy = 0;
		alinhadorPainelCentral2.insets = new Insets(5, 5, 5, 5);
		alinhadorPainelCentral2.anchor = GridBagConstraints.FIRST_LINE_START;

		
		tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		painelEsquerdo.add(botaoCadastrarVendas);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		painelEsquerdo.add(botaoAtualizarVendas);
		painelEsquerdo.add(Box.createVerticalStrut(5));

		Dimension tamanhoComboBox = new Dimension(200,30);
		tituloPrecos.setFont(new Font("Arial", Font.BOLD,14));
		listaPrecos = new JComboBox<String>();
		listaPrecos.setPreferredSize(tamanhoComboBox);
		listaPrecos.setMaximumSize(tamanhoComboBox);
		listaPrecos.addItem("3.000,00 - 10.000,00");
		listaPrecos.addItem("10.000,00 - 50.000,00");

		
		botaoBuscarPrecos.setPreferredSize(tamanhoBotoes2);
		botaoBuscarPrecos.setMaximumSize(tamanhoBotoes2);



		//adicao do painel Central
		alinhadorPainelCentral2.gridy = 0;
		painelCentral.add(tituloCadastro, alinhadorPainelCentral2);


		alinhadorPainelCentral2.gridy = 3;
		painelCentral.add(tituloPrecos,alinhadorPainelCentral2);
		alinhadorPainelCentral2.gridy = 4;
		painelCentral.add(new JScrollPane (veiculosTable),alinhadorPainelCentral2);

		alinhadorPainelCentral2.gridy = 5;
		painelCentral.add(botaoBuscarPrecos,alinhadorPainelCentral2);

		tela.add(painelEsquerdo, BorderLayout.WEST);
		tela.add(painelCentral);


		tela.setVisible(true);
}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botaoCadastrarVendas) {
			new TelaDetalheVendas();
		}
		
	}
	

}
